package br.com.evaldo.estudo.gerenciador_usuario.application.usecases.hospital;

import br.com.evaldo.estudo.gerenciador_usuario.application.gateways.HospitalRepository;
import br.com.evaldo.estudo.gerenciador_usuario.domain.models.Hospital;

import java.util.List;

public class BuscarHospitalUseCase {

    private final HospitalRepository repository;

    public BuscarHospitalUseCase(HospitalRepository repository) {
        this.repository = repository;
    }

    public Hospital buscarPorId(Long id){
        return repository.buscarPorId(id);
    }

    public List<Hospital> listarTodos(){
        return repository.listarTodos();
    }
}
