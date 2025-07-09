package br.com.evaldo.estudo.gerenciador_usuario.application.usecases.hospital;

import br.com.evaldo.estudo.gerenciador_usuario.application.gateways.HospitalRepository;
import br.com.evaldo.estudo.gerenciador_usuario.domain.models.Hospital;

public class BuscarHospitalUseCase {

    private final HospitalRepository repository;

    public BuscarHospitalUseCase(HospitalRepository repository) {
        this.repository = repository;
    }

    public Hospital buscarPorCPF(Long id){
        return repository.buscarPorId(id);
    }
}
