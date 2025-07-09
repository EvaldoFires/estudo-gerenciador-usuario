package br.com.evaldo.estudo.gerenciador_usuario.application.usecases.medico;

import br.com.evaldo.estudo.gerenciador_usuario.application.gateways.MedicoRepository;
import br.com.evaldo.estudo.gerenciador_usuario.domain.models.Medico;

public class BuscarMedicoUseCase {

    private final MedicoRepository repository;

    public BuscarMedicoUseCase(MedicoRepository repository) {
        this.repository = repository;
    }

    public Medico buscarPorCPF(String cpf){
        return repository.buscarPorCPF(cpf);
    }
}
