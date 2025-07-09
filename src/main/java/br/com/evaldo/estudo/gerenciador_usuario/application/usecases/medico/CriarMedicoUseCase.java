package br.com.evaldo.estudo.gerenciador_usuario.application.usecases.medico;

import br.com.evaldo.estudo.gerenciador_usuario.application.gateways.MedicoRepository;
import br.com.evaldo.estudo.gerenciador_usuario.domain.models.Medico;

public class CriarMedicoUseCase {

    private final MedicoRepository repository;

    public CriarMedicoUseCase(MedicoRepository repository) {
        this.repository = repository;
    }

    public Medico cadastrarMedico(Medico enfermeiro){
        return repository.cadastrarMedico(enfermeiro);
    }

}
