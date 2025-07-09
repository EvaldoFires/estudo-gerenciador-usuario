package br.com.evaldo.estudo.gerenciador_usuario.application.gateways;

import br.com.evaldo.estudo.gerenciador_usuario.domain.models.Paciente;

import java.util.List;

public interface PacienteRepository {

    Paciente cadastrarPaciente(Paciente paciente);

    Paciente buscarPorCPF(String cpf);

    List<Paciente> listarTodos();

    void deletarPorCPF(String cpf);
}
