package br.com.evaldo.estudo.gerenciador_usuario.application.usecases.medico;

import br.com.evaldo.estudo.gerenciador_usuario.application.gateways.MedicoRepository;
import br.com.evaldo.estudo.gerenciador_usuario.domain.models.Medico;

import java.util.List;

public class ListarMedicoUseCase {

    private final MedicoRepository repository;


    public ListarMedicoUseCase(MedicoRepository repository) {
        this.repository = repository;
    }

    public List<Medico> listarTodos(){
        return repository.listarTodos();
    }
}
