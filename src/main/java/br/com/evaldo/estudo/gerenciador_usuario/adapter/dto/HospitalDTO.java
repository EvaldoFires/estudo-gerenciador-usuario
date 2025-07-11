package br.com.evaldo.estudo.gerenciador_usuario.adapter.dto;

import br.com.evaldo.estudo.gerenciador_usuario.domain.models.enums.Tipo;

public record HospitalDTO(
        Long id,
        String nome,
        EnderecoDTO endereco,
        Tipo tipo
) {
}
