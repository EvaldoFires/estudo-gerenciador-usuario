package br.com.evaldo.estudo.gerenciador_usuario.infra.config;

import br.com.evaldo.estudo.gerenciador_usuario.adapter.mapper.PacienteMapper;
import br.com.evaldo.estudo.gerenciador_usuario.application.gateways.PacienteRepository;
import br.com.evaldo.estudo.gerenciador_usuario.application.usecases.paciente.BuscarPacienteUseCase;
import br.com.evaldo.estudo.gerenciador_usuario.application.usecases.paciente.CriarPacienteUseCase;
import br.com.evaldo.estudo.gerenciador_usuario.application.usecases.paciente.DeletarPacienteUseCase;
import br.com.evaldo.estudo.gerenciador_usuario.infra.persistence.gateways.PacienteRepositoryJPAImpl;
import br.com.evaldo.estudo.gerenciador_usuario.infra.persistence.repository.PacienteRepositoryJPA;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PacienteConfig {

    @Bean
    BuscarPacienteUseCase buscarPacienteUseCase(PacienteRepository repository){
        return new BuscarPacienteUseCase(repository);
    }

    @Bean
    CriarPacienteUseCase criarPacienteUseCase(PacienteRepository repository){
        return new CriarPacienteUseCase(repository);
    }

    @Bean
    DeletarPacienteUseCase deletarPacienteUseCase(PacienteRepository repository){
        return new DeletarPacienteUseCase(repository);
    }

    @Bean
    PacienteRepositoryJPAImpl criarImplementacaoPacienteRepositoryJPA(PacienteRepositoryJPA repositoryJPA,
                                                                      PacienteMapper mapper){
        return new PacienteRepositoryJPAImpl(repositoryJPA, mapper);
    }
}
