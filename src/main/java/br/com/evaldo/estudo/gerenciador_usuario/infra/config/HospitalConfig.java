package br.com.evaldo.estudo.gerenciador_usuario.infra.config;

import br.com.evaldo.estudo.gerenciador_usuario.adapter.mapper.HospitalMapper;
import br.com.evaldo.estudo.gerenciador_usuario.application.gateways.HospitalRepository;
import br.com.evaldo.estudo.gerenciador_usuario.application.usecases.hospital.BuscarHospitalUseCase;
import br.com.evaldo.estudo.gerenciador_usuario.application.usecases.hospital.CriarHospitalUseCase;
import br.com.evaldo.estudo.gerenciador_usuario.application.usecases.hospital.DeletarHospitalUseCase;
import br.com.evaldo.estudo.gerenciador_usuario.infra.persistence.gateways.HospitalRepositoryJPAImpl;
import br.com.evaldo.estudo.gerenciador_usuario.infra.persistence.repository.HospitalRepositoryJPA;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HospitalConfig {

    @Bean
    BuscarHospitalUseCase buscarHospitalUseCase(HospitalRepository repository){
        return new BuscarHospitalUseCase(repository);
    }

    @Bean
    CriarHospitalUseCase criarHospitalUseCase(HospitalRepository repository){
        return new CriarHospitalUseCase(repository);
    }

    @Bean
    DeletarHospitalUseCase deletarHospitalUseCase(HospitalRepository repository){
        return new DeletarHospitalUseCase(repository);
    }

    @Bean
    HospitalRepositoryJPAImpl criarImplementacaoHospitalRepositoryJPA(HospitalRepositoryJPA repositoryJPA,
                                                                      HospitalMapper mapper){
        return new HospitalRepositoryJPAImpl(repositoryJPA, mapper);
    }
}
