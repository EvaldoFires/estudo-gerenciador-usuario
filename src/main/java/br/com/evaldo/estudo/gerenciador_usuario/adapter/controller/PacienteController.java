package br.com.evaldo.estudo.gerenciador_usuario.adapter.controller;

import br.com.evaldo.estudo.gerenciador_usuario.adapter.dto.PacienteDTO;
import br.com.evaldo.estudo.gerenciador_usuario.adapter.mapper.PacienteMapper;
import br.com.evaldo.estudo.gerenciador_usuario.application.usecases.paciente.BuscarPacienteUseCase;
import br.com.evaldo.estudo.gerenciador_usuario.application.usecases.paciente.CriarPacienteUseCase;
import br.com.evaldo.estudo.gerenciador_usuario.application.usecases.paciente.DeletarPacienteUseCase;
import br.com.evaldo.estudo.gerenciador_usuario.domain.models.Paciente;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
@AllArgsConstructor
public class PacienteController {

    private final BuscarPacienteUseCase buscarPaciente;
    private final CriarPacienteUseCase criarPaciente;
    private final DeletarPacienteUseCase deletarPaciente;
    private final PacienteMapper mapper;

    @GetMapping("/{cpf}")
    public ResponseEntity<PacienteDTO> buscarPorCPF(@PathVariable String cpf){
        PacienteDTO pacienteDTO = mapper.toDTO(buscarPaciente.buscarPorCPF(cpf));
        return ResponseEntity.ok(pacienteDTO);
    }

    @GetMapping
    public ResponseEntity<List<PacienteDTO>> listarTodos(){
        List<PacienteDTO> pacientes = buscarPaciente.listarTodos().stream().map(mapper::toDTO).toList();
        return ResponseEntity.ok(pacientes);
    }

    @PostMapping
    public ResponseEntity<PacienteDTO> criarPaciente (@RequestBody PacienteDTO pacienteDTO){
        Paciente paciente = mapper.toDomain(pacienteDTO);
        paciente = criarPaciente.cadastrarPaciente(paciente);
        PacienteDTO pacienteCadastrado = mapper.toDTO(paciente);
        return ResponseEntity.status(HttpStatus.CREATED).body(pacienteCadastrado);
    }

    @DeleteMapping("/{cpf}")
    public ResponseEntity<Void> deletarPacientePorCPF(@PathVariable String cpf){
        deletarPaciente.deletarPorCPF(cpf);
        return ResponseEntity.noContent().build();
    }
}
