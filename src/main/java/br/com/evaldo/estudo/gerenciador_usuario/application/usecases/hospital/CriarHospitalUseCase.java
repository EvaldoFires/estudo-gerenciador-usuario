package br.com.evaldo.estudo.gerenciador_usuario.application.usecases.hospital;

import br.com.evaldo.estudo.gerenciador_usuario.application.gateways.HospitalRepository;
import br.com.evaldo.estudo.gerenciador_usuario.domain.models.Hospital;

public class CriarHospitalUseCase {

    private final HospitalRepository repository;

    public CriarHospitalUseCase(HospitalRepository repository) {
        this.repository = repository;
    }

    public Hospital cadastrarHospital(Hospital enfermeiro){
        return repository.cadastrarHospital(enfermeiro);
    }

}
