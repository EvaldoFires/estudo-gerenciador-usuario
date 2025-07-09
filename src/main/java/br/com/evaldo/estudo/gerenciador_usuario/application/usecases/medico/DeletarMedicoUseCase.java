package br.com.evaldo.estudo.gerenciador_usuario.application.usecases.medico;

import br.com.evaldo.estudo.gerenciador_usuario.application.gateways.MedicoRepository;

public class DeletarMedicoUseCase {

    private final MedicoRepository repository;

    public DeletarMedicoUseCase(MedicoRepository repository) {
        this.repository = repository;
    }

    public void deletarPorCPF(String cpf){
        repository.deletarPorCPF(cpf);
    }
}
