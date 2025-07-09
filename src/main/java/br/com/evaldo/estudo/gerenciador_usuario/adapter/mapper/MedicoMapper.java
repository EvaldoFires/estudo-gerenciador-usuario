package br.com.evaldo.estudo.gerenciador_usuario.adapter.mapper;

import br.com.evaldo.estudo.gerenciador_usuario.adapter.dto.MedicoDTO;
import br.com.evaldo.estudo.gerenciador_usuario.domain.models.Medico;
import br.com.evaldo.estudo.gerenciador_usuario.infra.persistence.entities.MedicoEntity;
import org.springframework.stereotype.Component;

@Component
public class MedicoMapper {

    public MedicoDTO toDTO(Medico medico) {
        return new MedicoDTO(medico.getCpf(), medico.getNome(),
                medico.getCrm(), medico.getEspecialidade());
    }

    public Medico toDomain(MedicoDTO dto) {
        return new Medico(
                dto.cpf(),
                dto.nome(),
                dto.crm(),
                dto.especialidade()
        );
    }

    public MedicoEntity toEntity(Medico medico) {
        MedicoEntity entity = new MedicoEntity();
        entity.setCpf(medico.getCpf());
        entity.setNome(medico.getNome());
        entity.setCrm(medico.getCrm());
        entity.setEspecialidade(medico.getEspecialidade());
        return entity;
    }

    public Medico toDomain(MedicoEntity entity) {
        return new Medico(
                entity.getCpf(),
                entity.getNome(),
                entity.getCrm(),
                entity.getEspecialidade()
        );
    }


}
