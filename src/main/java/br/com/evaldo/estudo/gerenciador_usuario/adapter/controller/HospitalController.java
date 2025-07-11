package br.com.evaldo.estudo.gerenciador_usuario.adapter.controller;

import br.com.evaldo.estudo.gerenciador_usuario.adapter.dto.HospitalDTO;
import br.com.evaldo.estudo.gerenciador_usuario.adapter.mapper.HospitalMapper;
import br.com.evaldo.estudo.gerenciador_usuario.application.usecases.hospital.BuscarHospitalUseCase;
import br.com.evaldo.estudo.gerenciador_usuario.application.usecases.hospital.CriarHospitalUseCase;
import br.com.evaldo.estudo.gerenciador_usuario.application.usecases.hospital.DeletarHospitalUseCase;
import br.com.evaldo.estudo.gerenciador_usuario.domain.models.Hospital;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hospitals")
@AllArgsConstructor
public class HospitalController {

    private final BuscarHospitalUseCase buscarHospital;
    private final CriarHospitalUseCase criarHospital;
    private final DeletarHospitalUseCase deletarHospital;
    private final HospitalMapper mapper;

    @GetMapping("/{id}")
    public ResponseEntity<HospitalDTO> buscarPorId(@PathVariable Long id){
        HospitalDTO hospitalDTO = mapper.toDTO(buscarHospital.buscarPorId(id));
        return ResponseEntity.ok(hospitalDTO);
    }

    @GetMapping
    public ResponseEntity<List<HospitalDTO>> listarTodos(){
        List<HospitalDTO> hospitals = buscarHospital.listarTodos().stream().map(mapper::toDTO).toList();
        return ResponseEntity.ok(hospitals);
    }

    @PostMapping
    public ResponseEntity<HospitalDTO> criarHospital (@RequestBody HospitalDTO hospitalDTO){
        Hospital hospital = mapper.toDomain(hospitalDTO);
        hospital = criarHospital.cadastrarHospital(hospital);
        HospitalDTO hospitalCadastrado = mapper.toDTO(hospital);
        return ResponseEntity.status(HttpStatus.CREATED).body(hospitalCadastrado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarHospitalPorId(@PathVariable Long id){
        deletarHospital.deletarPorId(id);
        return ResponseEntity.noContent().build();
    }
}
