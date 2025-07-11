package br.com.evaldo.estudo.gerenciador_usuario.infra.persistence.repository;

import br.com.evaldo.estudo.gerenciador_usuario.infra.persistence.entities.PacienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepositoryJPA extends JpaRepository<PacienteEntity, String> {
}
