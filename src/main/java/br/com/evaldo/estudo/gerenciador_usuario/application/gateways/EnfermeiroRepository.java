package br.com.evaldo.estudo.gerenciador_usuario.application.gateways;

import br.com.evaldo.estudo.gerenciador_usuario.domain.models.Enfermeiro;

import java.util.List;

public interface EnfermeiroRepository {

    Enfermeiro cadastrarEnfermeiro(Enfermeiro enfermeiro);

    Enfermeiro buscarPorCPF(String cpf);

    List<Enfermeiro> listarTodos();

    void deletarPorCPF(String cpf);
}
