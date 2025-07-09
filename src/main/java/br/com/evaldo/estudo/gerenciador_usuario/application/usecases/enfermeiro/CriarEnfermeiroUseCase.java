package br.com.evaldo.estudo.gerenciador_usuario.application.usecases.enfermeiro;

import br.com.evaldo.estudo.gerenciador_usuario.application.gateways.EnfermeiroRepository;
import br.com.evaldo.estudo.gerenciador_usuario.domain.models.Enfermeiro;

public class CriarEnfermeiroUseCase {

    private final EnfermeiroRepository repository;

    public CriarEnfermeiroUseCase(EnfermeiroRepository repository) {
        this.repository = repository;
    }

    public Enfermeiro cadastrarEnfermeiro(Enfermeiro enfermeiro){
        return repository.cadastrarEnfermeiro(enfermeiro);
    }

}
