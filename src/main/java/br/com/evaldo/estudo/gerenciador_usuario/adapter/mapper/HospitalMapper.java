package br.com.evaldo.estudo.gerenciador_usuario.adapter.mapper;

import br.com.evaldo.estudo.gerenciador_usuario.adapter.dto.HospitalDTO;
import br.com.evaldo.estudo.gerenciador_usuario.domain.models.Hospital;
import br.com.evaldo.estudo.gerenciador_usuario.infra.persistence.entities.HospitalEntity;
import org.springframework.stereotype.Component;

@Component
public class HospitalMapper {

    private final EnderecoMapper enderecoMapper;

    public HospitalMapper(EnderecoMapper enderecoMapper) {
        this.enderecoMapper = enderecoMapper;
    }

    public HospitalDTO toDTO(Hospital hospital) {
        return new HospitalDTO(hospital.getId(),
                hospital.getNome(),
                enderecoMapper.toDTO(hospital.getEndereco()),
                hospital.getTipo());
    }

    public Hospital toDomain(HospitalDTO dto) {
        return new Hospital(
                dto.id(),
                dto.nome(),
                enderecoMapper.toDomain(dto.endereco()),
                dto.tipo()
        );
    }

    public HospitalEntity toEntity(Hospital hospital) {
        return new HospitalEntity(
                hospital.getId(),
                hospital.getNome(),
                enderecoMapper.toEntity(hospital.getEndereco()),
                hospital.getTipo()
        );
    }

    public Hospital toDomain(HospitalEntity entity) {
        return new Hospital(
                entity.getId(),
                entity.getNome(),
                enderecoMapper.toDomain(entity.getEndereco()),
                entity.getTipo()
        );
    }


}
