package br.com.evaldo.estudo.gerenciador_usuario.application.usecases.paciente;

import br.com.evaldo.estudo.gerenciador_usuario.application.gateways.PacienteRepository;
import br.com.evaldo.estudo.gerenciador_usuario.domain.models.Paciente;

import java.util.List;

public class ListarPacienteUseCase {

    private final PacienteRepository repository;


    public ListarPacienteUseCase(PacienteRepository repository) {
        this.repository = repository;
    }

    public List<Paciente> listarTodos(){
        return repository.listarTodos();
    }
}
