package br.com.evaldo.estudo.gerenciador_usuario.infra.config;

import br.com.evaldo.estudo.gerenciador_usuario.adapter.mapper.MedicoMapper;
import br.com.evaldo.estudo.gerenciador_usuario.application.gateways.MedicoRepository;
import br.com.evaldo.estudo.gerenciador_usuario.application.usecases.medico.BuscarMedicoUseCase;
import br.com.evaldo.estudo.gerenciador_usuario.application.usecases.medico.CriarMedicoUseCase;
import br.com.evaldo.estudo.gerenciador_usuario.application.usecases.medico.DeletarMedicoUseCase;
import br.com.evaldo.estudo.gerenciador_usuario.infra.persistence.gateways.MedicoRepositoryJPAImpl;
import br.com.evaldo.estudo.gerenciador_usuario.infra.persistence.repository.MedicoRepositoryJPA;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MedicoConfig {
    
    @Bean
    BuscarMedicoUseCase buscarMedicoUseCase(MedicoRepository repository){
        return new BuscarMedicoUseCase(repository);
    }

    @Bean
    CriarMedicoUseCase criarMedicoUseCase(MedicoRepository repository){
        return new CriarMedicoUseCase(repository);
    }

    @Bean
    DeletarMedicoUseCase deletarMedicoUseCase(MedicoRepository repository){
        return new DeletarMedicoUseCase(repository);
    }

    @Bean
    MedicoRepositoryJPAImpl criarImplementacaoMedicoRepositoryJPA(MedicoRepositoryJPA repositoryJPA,
                                                                  MedicoMapper mapper){
        return new MedicoRepositoryJPAImpl(repositoryJPA, mapper);
    }
}
