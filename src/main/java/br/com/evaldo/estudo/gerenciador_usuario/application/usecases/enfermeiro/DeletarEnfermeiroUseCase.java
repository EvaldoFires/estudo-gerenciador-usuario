package br.com.evaldo.estudo.gerenciador_usuario.application.usecases.enfermeiro;

import br.com.evaldo.estudo.gerenciador_usuario.application.gateways.EnfermeiroRepository;

public class DeletarEnfermeiroUseCase {

    private final EnfermeiroRepository repository;

    public DeletarEnfermeiroUseCase(EnfermeiroRepository repository) {
        this.repository = repository;
    }

    public void deletarPorCPF(String cpf){
        repository.deletarPorCPF(cpf);
    }
}
