package br.com.evaldo.estudo.gerenciador_usuario.application.usecases.paciente;

import br.com.evaldo.estudo.gerenciador_usuario.application.gateways.PacienteRepository;

public class DeletarPacienteUseCase {

    private final PacienteRepository repository;

    public DeletarPacienteUseCase(PacienteRepository repository) {
        this.repository = repository;
    }

    public void deletarPorCPF(String cpf){
        repository.deletarPorCPF(cpf);
    }
}
