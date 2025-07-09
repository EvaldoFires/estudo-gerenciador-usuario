package br.com.evaldo.estudo.gerenciador_usuario.application.usecases.hospital;

import br.com.evaldo.estudo.gerenciador_usuario.application.gateways.HospitalRepository;
import br.com.evaldo.estudo.gerenciador_usuario.domain.models.Hospital;

import java.util.List;

public class ListarHospitalUseCase {

    private final HospitalRepository repository;


    public ListarHospitalUseCase(HospitalRepository repository) {
        this.repository = repository;
    }

    public List<Hospital> listarTodos(){
        return repository.listarTodos();
    }
}
