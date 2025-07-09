package br.com.evaldo.estudo.gerenciador_usuario.domain.models.enums;

public enum Especialidade {
    CARDIOLOGIA("Cardiologia"),
    DERMATOLOGIA("Dermatologia"),
    PEDIATRIA("Pediatria"),
    CLINICO("Clinico");

    private final String descricao;

    Especialidade(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
