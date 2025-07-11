package br.com.evaldo.estudo.gerenciador_usuario.adapter.mapper;

import br.com.evaldo.estudo.gerenciador_usuario.adapter.dto.EnderecoDTO;
import br.com.evaldo.estudo.gerenciador_usuario.domain.valueobject.Endereco;
import br.com.evaldo.estudo.gerenciador_usuario.infra.persistence.entities.EnderecoEntity;
import org.springframework.stereotype.Component;

@Component
public class EnderecoMapper {

    public EnderecoDTO toDTO (Endereco endereco){
        return  new EnderecoDTO(endereco.getCep(),
                endereco.getEstado(),
                endereco.getCidade(),
                endereco.getBairro(),
                endereco.getRua(),
                endereco.getNumero(),
                endereco.getComplemento());
    }

    public Endereco toDomain (EnderecoDTO dto){
        return new Endereco(dto.cep(),
                dto.estado(),
                dto.cidade(),
                dto.bairro(),
                dto.rua(),
                dto.numero(),
                dto.complemento());
    }

    public EnderecoEntity toEntity (Endereco endereco){
        return new EnderecoEntity(endereco.getCep(),
                endereco.getEstado(),
                endereco.getCidade(),
                endereco.getBairro(),
                endereco.getRua(),
                endereco.getNumero(),
                endereco.getComplemento());
    }

    public Endereco toDomain (EnderecoEntity entity){
        return new Endereco(entity.getCep(),
                entity.getEstado(),
                entity.getCidade(),
                entity.getBairro(),
                entity.getRua(),
                entity.getNumero(),
                entity.getComplemento());
    }
}
