package br.com.evaldo.estudo.gerenciador_usuario.application.gateways;

import br.com.evaldo.estudo.gerenciador_usuario.domain.models.Hospital;
import br.com.evaldo.estudo.gerenciador_usuario.domain.models.Hospital;

import java.util.List;

public interface HospitalRepository {
    
    Hospital cadastrarHospital(Hospital hospital);
    
    Hospital buscarPorId(Long id);
    
    List<Hospital> listarTodos();
    
    void deletarPorId(Long Id);
}
