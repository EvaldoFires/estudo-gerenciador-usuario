package br.com.evaldo.estudo.gerenciador_usuario.infra.config;

import br.com.evaldo.estudo.gerenciador_usuario.adapter.mapper.EnfermeiroMapper;
import br.com.evaldo.estudo.gerenciador_usuario.application.gateways.EnfermeiroRepository;
import br.com.evaldo.estudo.gerenciador_usuario.application.usecases.enfermeiro.BuscarEnfermeiroUseCase;
import br.com.evaldo.estudo.gerenciador_usuario.application.usecases.enfermeiro.CriarEnfermeiroUseCase;
import br.com.evaldo.estudo.gerenciador_usuario.application.usecases.enfermeiro.DeletarEnfermeiroUseCase;
import br.com.evaldo.estudo.gerenciador_usuario.infra.persistence.gateways.EnfermeiroRepositoryJPAImpl;
import br.com.evaldo.estudo.gerenciador_usuario.infra.persistence.repository.EnfermeiroRepositoryJPA;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EnfermeiroConfig {

    @Bean
    BuscarEnfermeiroUseCase buscarEnfermeiroUseCase(EnfermeiroRepository repository){
        return new BuscarEnfermeiroUseCase(repository);
    }

    @Bean
    CriarEnfermeiroUseCase criarEnfermeiroUseCase(EnfermeiroRepository repository){
        return new CriarEnfermeiroUseCase(repository);
    }

    @Bean
    DeletarEnfermeiroUseCase deletarEnfermeiroUseCase(EnfermeiroRepository repository){
        return new DeletarEnfermeiroUseCase(repository);
    }

    @Bean
    EnfermeiroRepositoryJPAImpl criarImplementacaoEnfermeiroRepositoryJPA(EnfermeiroRepositoryJPA repositoryJPA,
                                                                          EnfermeiroMapper mapper){
        return new EnfermeiroRepositoryJPAImpl(repositoryJPA, mapper );
    }
}
