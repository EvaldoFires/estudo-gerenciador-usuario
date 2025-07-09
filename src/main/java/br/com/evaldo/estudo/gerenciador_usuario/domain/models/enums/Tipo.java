package br.com.evaldo.estudo.gerenciador_usuario.domain.models.enums;

public enum Tipo {
    AMA("Assistências Médicas Ambulatoriais"),
    UPA("Unidade de Pronto Atendimento"),
    PS("Pronto Socorro");

    private final String descricao;

    Tipo(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
