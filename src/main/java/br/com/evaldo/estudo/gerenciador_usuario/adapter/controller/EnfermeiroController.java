package br.com.evaldo.estudo.gerenciador_usuario.adapter.controller;

import br.com.evaldo.estudo.gerenciador_usuario.adapter.dto.EnfermeiroDTO;
import br.com.evaldo.estudo.gerenciador_usuario.adapter.mapper.EnfermeiroMapper;
import br.com.evaldo.estudo.gerenciador_usuario.application.usecases.enfermeiro.BuscarEnfermeiroUseCase;
import br.com.evaldo.estudo.gerenciador_usuario.application.usecases.enfermeiro.CriarEnfermeiroUseCase;
import br.com.evaldo.estudo.gerenciador_usuario.application.usecases.enfermeiro.DeletarEnfermeiroUseCase;
import br.com.evaldo.estudo.gerenciador_usuario.domain.models.Enfermeiro;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enfermeiros")
@AllArgsConstructor
public class EnfermeiroController {

    private final BuscarEnfermeiroUseCase buscarEnfermeiro;
    private final CriarEnfermeiroUseCase criarEnfermeiro;
    private final DeletarEnfermeiroUseCase deletarEnfermeiro;
    private final EnfermeiroMapper mapper;

    @GetMapping("/{cpf}")
    public ResponseEntity<EnfermeiroDTO> buscarPorCPF(@PathVariable String cpf){
        EnfermeiroDTO enfermeiroDTO = mapper.toDTO(buscarEnfermeiro.buscarPorCPF(cpf));
        return ResponseEntity.ok(enfermeiroDTO);
    }

    @GetMapping
    public ResponseEntity<List<EnfermeiroDTO>> listarTodos(){
        List<EnfermeiroDTO> enfermeiros = buscarEnfermeiro.listarTodos().stream().map(mapper::toDTO).toList();
        return ResponseEntity.ok(enfermeiros);
    }

    @PostMapping
    public ResponseEntity<EnfermeiroDTO> criarEnfermeiro (@RequestBody EnfermeiroDTO enfermeiroDTO){
        Enfermeiro enfermeiro = mapper.toDomain(enfermeiroDTO);
        enfermeiro = criarEnfermeiro.cadastrarEnfermeiro(enfermeiro);
        EnfermeiroDTO enfermeiroCadastrado = mapper.toDTO(enfermeiro);
        return ResponseEntity.status(HttpStatus.CREATED).body(enfermeiroCadastrado);
    }

    @DeleteMapping("/{cpf}")
    public ResponseEntity<Void> deletarEnfermeiroPorCPF(@PathVariable String cpf){
        deletarEnfermeiro.deletarPorCPF(cpf);
        return ResponseEntity.noContent().build();
    }
}
