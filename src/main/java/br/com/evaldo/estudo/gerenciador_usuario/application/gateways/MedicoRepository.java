package br.com.evaldo.estudo.gerenciador_usuario.application.gateways;

import br.com.evaldo.estudo.gerenciador_usuario.domain.models.Medico;

import java.util.List;

public interface MedicoRepository {
    
    Medico cadastrarMedico(Medico medico);
    
    Medico buscarPorCPF(String cpf);
    
    List<Medico> listarTodos();
    
    void deletarPorCPF(String cpf);
}
