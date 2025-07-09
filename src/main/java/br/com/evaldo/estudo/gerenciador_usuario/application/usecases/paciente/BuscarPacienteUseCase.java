package br.com.evaldo.estudo.gerenciador_usuario.application.usecases.paciente;

import br.com.evaldo.estudo.gerenciador_usuario.application.gateways.PacienteRepository;
import br.com.evaldo.estudo.gerenciador_usuario.domain.models.Paciente;

public class BuscarPacienteUseCase {

    private final PacienteRepository repository;

    public BuscarPacienteUseCase(PacienteRepository repository) {
        this.repository = repository;
    }

    public Paciente buscarPorCPF(String cpf){
        return repository.buscarPorCPF(cpf);
    }
}
