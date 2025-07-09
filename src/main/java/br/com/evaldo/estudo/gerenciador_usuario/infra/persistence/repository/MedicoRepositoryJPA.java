package br.com.evaldo.estudo.gerenciador_usuario.infra.persistence.repository;

import br.com.evaldo.estudo.gerenciador_usuario.domain.models.Medico;
import br.com.evaldo.estudo.gerenciador_usuario.infra.persistence.entities.MedicoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MedicoRepositoryJPA extends JpaRepository<MedicoEntity, String> {

}
