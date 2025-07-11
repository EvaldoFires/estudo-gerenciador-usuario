package br.com.evaldo.estudo.gerenciador_usuario.infra.persistence.repository;

import br.com.evaldo.estudo.gerenciador_usuario.infra.persistence.entities.EnfermeiroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface EnfermeiroRepositoryJPA extends JpaRepository<EnfermeiroEntity, String> {
}
