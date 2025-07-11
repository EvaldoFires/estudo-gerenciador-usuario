package br.com.evaldo.estudo.gerenciador_usuario.adapter.dto;

import br.com.evaldo.estudo.gerenciador_usuario.domain.valueobject.Endereco;

import java.time.LocalDate;

public record PacienteDTO(
        String cpf,
        String nome,
        String email,
        LocalDate nascimento,
        EnderecoDTO endereco,
        String dadosDeSaude
) {
}
