package br.com.evaldo.estudo.gerenciador_usuario.application.usecases.paciente;

import br.com.evaldo.estudo.gerenciador_usuario.application.gateways.PacienteRepository;
import br.com.evaldo.estudo.gerenciador_usuario.domain.models.Paciente;

public class CriarPacienteUseCase {

    private final PacienteRepository repository;

    public CriarPacienteUseCase(PacienteRepository repository) {
        this.repository = repository;
    }

    public Paciente cadastrarPaciente(Paciente enfermeiro){
        return repository.cadastrarPaciente(enfermeiro);
    }

}
