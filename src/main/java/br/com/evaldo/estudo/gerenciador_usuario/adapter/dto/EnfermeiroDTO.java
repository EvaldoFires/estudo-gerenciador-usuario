package br.com.evaldo.estudo.gerenciador_usuario.adapter.dto;

import br.com.evaldo.estudo.gerenciador_usuario.domain.models.enums.Especialidade;

public record EnfermeiroDTO(
        String cpf,
        String nome,
        String coren,
        Especialidade especialidade
) {
}
