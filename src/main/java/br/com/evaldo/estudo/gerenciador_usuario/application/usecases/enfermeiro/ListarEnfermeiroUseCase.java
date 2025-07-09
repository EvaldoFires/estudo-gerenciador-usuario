package br.com.evaldo.estudo.gerenciador_usuario.application.usecases.enfermeiro;

import br.com.evaldo.estudo.gerenciador_usuario.application.gateways.EnfermeiroRepository;
import br.com.evaldo.estudo.gerenciador_usuario.domain.models.Enfermeiro;

import java.util.List;

public class ListarEnfermeiroUseCase {

    private final EnfermeiroRepository repository;


    public ListarEnfermeiroUseCase(EnfermeiroRepository repository) {
        this.repository = repository;
    }

    public List<Enfermeiro> listarTodos(){
        return repository.listarTodos();
    }
}
