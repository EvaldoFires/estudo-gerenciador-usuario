package br.com.evaldo.estudo.gerenciador_usuario.domain.models;

import br.com.evaldo.estudo.gerenciador_usuario.domain.models.enums.Tipo;
import br.com.evaldo.estudo.gerenciador_usuario.domain.valueobject.Endereco;

public class Hospital {

    private Long id;
    private String nome;
    private Endereco endereco;
    private Tipo tipo;

    public Hospital(Long id, String nome, Endereco endereco, Tipo tipo) {
        this.endereco = endereco;
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
