package br.com.evaldo.estudo.gerenciador_usuario.application.usecases.hospital;

import br.com.evaldo.estudo.gerenciador_usuario.application.gateways.HospitalRepository;

public class DeletarHospitalUseCase {

    private final HospitalRepository repository;

    public DeletarHospitalUseCase(HospitalRepository repository) {
        this.repository = repository;
    }

    public void deletarPorId(Long id){
        repository.deletarPorId(id);
    }
}
