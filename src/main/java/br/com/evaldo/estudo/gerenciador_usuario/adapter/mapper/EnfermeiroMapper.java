package br.com.evaldo.estudo.gerenciador_usuario.adapter.mapper;

import br.com.evaldo.estudo.gerenciador_usuario.adapter.dto.EnfermeiroDTO;
import br.com.evaldo.estudo.gerenciador_usuario.domain.models.Enfermeiro;
import br.com.evaldo.estudo.gerenciador_usuario.infra.persistence.entities.EnfermeiroEntity;
import org.springframework.stereotype.Component;

@Component
public class EnfermeiroMapper {

    public EnfermeiroDTO toDTO(Enfermeiro enfermeiro) {
        return new EnfermeiroDTO(enfermeiro.getCpf(),
                enfermeiro.getNome(),
                enfermeiro.getCoren(),
                enfermeiro.getEspecialidade());
    }

    public Enfermeiro toDomain(EnfermeiroDTO dto) {
        return new Enfermeiro(
                dto.cpf(),
                dto.nome(),
                dto.coren(),
                dto.especialidade()
        );
    }

    public EnfermeiroEntity toEntity(Enfermeiro enfermeiro) {
        return new EnfermeiroEntity(enfermeiro.getCpf(),
                enfermeiro.getNome(),
                enfermeiro.getCoren(),
                enfermeiro.getEspecialidade());
    }

    public Enfermeiro toDomain(EnfermeiroEntity entity) {
        return new Enfermeiro(
                entity.getCpf(),
                entity.getNome(),
                entity.getCoren(),
                entity.getEspecialidade()
        );
    }


}
