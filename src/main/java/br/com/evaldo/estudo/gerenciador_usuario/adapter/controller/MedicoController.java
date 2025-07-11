package br.com.evaldo.estudo.gerenciador_usuario.adapter.controller;

import br.com.evaldo.estudo.gerenciador_usuario.adapter.dto.MedicoDTO;
import br.com.evaldo.estudo.gerenciador_usuario.adapter.mapper.MedicoMapper;
import br.com.evaldo.estudo.gerenciador_usuario.application.usecases.medico.BuscarMedicoUseCase;
import br.com.evaldo.estudo.gerenciador_usuario.application.usecases.medico.CriarMedicoUseCase;
import br.com.evaldo.estudo.gerenciador_usuario.application.usecases.medico.DeletarMedicoUseCase;
import br.com.evaldo.estudo.gerenciador_usuario.domain.models.Medico;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicos")
@AllArgsConstructor
public class MedicoController {

    private final BuscarMedicoUseCase buscarMedico;
    private final CriarMedicoUseCase criarMedico;
    private final DeletarMedicoUseCase deletarMedico;
    private final MedicoMapper mapper;

    @GetMapping("/{cpf}")
    public ResponseEntity<MedicoDTO> buscarPorCPF(@PathVariable String cpf){
        MedicoDTO medicoDTO = mapper.toDTO(buscarMedico.buscarPorCPF(cpf));
        return ResponseEntity.ok(medicoDTO);
    }

    @GetMapping
    public ResponseEntity<List<MedicoDTO>> listarTodos(){
        List<MedicoDTO> medicos = buscarMedico.listarTodos().stream().map(mapper::toDTO).toList();
        return ResponseEntity.ok(medicos);
    }

    @PostMapping
    public ResponseEntity<MedicoDTO> criarMedico (@RequestBody MedicoDTO medicoDTO){
        Medico medico = mapper.toDomain(medicoDTO);
        medico = criarMedico.cadastrarMedico(medico);
        MedicoDTO medicoCadastrado = mapper.toDTO(medico);
        return ResponseEntity.status(HttpStatus.CREATED).body(medicoCadastrado);
    }

    @DeleteMapping("/{cpf}")
    public ResponseEntity<Void> deletarMedicoPorCPF(@PathVariable String cpf){
        deletarMedico.deletarPorCPF(cpf);
        return ResponseEntity.noContent().build();
    }
}
