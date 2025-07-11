package br.com.evaldo.estudo.gerenciador_usuario.infra.persistence.repository;

import br.com.evaldo.estudo.gerenciador_usuario.infra.persistence.entities.HospitalEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HospitalRepositoryJPA extends JpaRepository<HospitalEntity, Long> {
}
