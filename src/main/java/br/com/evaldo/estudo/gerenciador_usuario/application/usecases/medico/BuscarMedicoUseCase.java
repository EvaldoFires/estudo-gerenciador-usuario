package br.com.evaldo.estudo.gerenciador_usuario.application.usecases.medico;

import br.com.evaldo.estudo.gerenciador_usuario.application.gateways.MedicoRepository;
import br.com.evaldo.estudo.gerenciador_usuario.domain.models.Medico;

import java.util.List;

public class BuscarMedicoUseCase {

    private final MedicoRepository repository;

    public BuscarMedicoUseCase(MedicoRepository repository) {
        this.repository = repository;
    }

    public Medico buscarPorCPF(String cpf){
        return repository.buscarPorCPF(cpf);
    }

    public List<Medico> listarTodos(){
        return repository.listarTodos();
    }
}
