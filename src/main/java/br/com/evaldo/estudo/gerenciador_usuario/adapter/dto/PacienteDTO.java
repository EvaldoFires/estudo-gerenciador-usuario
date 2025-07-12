package br.com.evaldo.estudo.gerenciador_usuario.adapter.dto;

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
