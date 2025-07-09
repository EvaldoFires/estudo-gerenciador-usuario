package br.com.evaldo.estudo.gerenciador_usuario.adapter.dto;

import br.com.evaldo.estudo.gerenciador_usuario.domain.models.enums.Especialidade;

public record MedicoDTO(
        String cpf,
        String nome,
        String crm,
        Especialidade especialidade
) {
}
