package br.com.evaldo.estudo.gerenciador_usuario.adapter.mapper;

import br.com.evaldo.estudo.gerenciador_usuario.adapter.dto.PacienteDTO;
import br.com.evaldo.estudo.gerenciador_usuario.domain.models.Paciente;
import br.com.evaldo.estudo.gerenciador_usuario.infra.persistence.entities.PacienteEntity;
import org.springframework.stereotype.Component;

@Component
public class PacienteMapper {

    private final EnderecoMapper enderecoMapper;

    public PacienteMapper(EnderecoMapper enderecoMapper) {
        this.enderecoMapper = enderecoMapper;
    }

    public PacienteDTO toDTO(Paciente paciente) {
        return new PacienteDTO(paciente.getCpf(), 
                paciente.getNome(),
                paciente.getEmail(),
                paciente.getNascimento(),
                enderecoMapper.toDTO(paciente.getEndereco()),
                paciente.getDadosDeSaude());
    }

    public Paciente toDomain(PacienteDTO dto) {
        return new Paciente(
                dto.cpf(),
                dto.nome(),
                dto.email(),
                dto.nascimento(),
                enderecoMapper.toDomain(dto.endereco()),
                dto.dadosDeSaude()
        );
    }

    public PacienteEntity toEntity(Paciente paciente) {
        return new PacienteEntity(
                paciente.getCpf(),
                paciente.getNome(),
                paciente.getEmail(),
                paciente.getNascimento(),
                enderecoMapper.toEntity(paciente.getEndereco()),
                paciente.getDadosDeSaude()
        );
    }

    public Paciente toDomain(PacienteEntity entity) {
        return new Paciente(
                entity.getCpf(),
                entity.getNome(),
                entity.getEmail(),
                entity.getNascimento(),
                enderecoMapper.toDomain(entity.getEndereco()),
                entity.getDadosDeSaude()
        );
    }


}
