package br.com.evaldo.estudo.gerenciador_usuario.application.usecases.enfermeiro;

import br.com.evaldo.estudo.gerenciador_usuario.application.gateways.EnfermeiroRepository;
import br.com.evaldo.estudo.gerenciador_usuario.domain.models.Enfermeiro;

public class BuscarEnfermeiroUseCase {

    private final EnfermeiroRepository repository;

    public BuscarEnfermeiroUseCase(EnfermeiroRepository repository) {
        this.repository = repository;
    }

    public Enfermeiro buscarPorCPF(String cpf){
        return repository.buscarPorCPF(cpf);
    }

}
