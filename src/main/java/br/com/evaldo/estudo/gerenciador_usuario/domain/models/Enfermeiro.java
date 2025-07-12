package br.com.evaldo.estudo.gerenciador_usuario.domain.models;

import br.com.evaldo.estudo.gerenciador_usuario.domain.models.enums.Especialidade;

public class Enfermeiro {

    private String cpf;
    private String nome;
    private String coren;
    private Especialidade especialidade;

    public Enfermeiro(String cpf, String nome, String coren, Especialidade especialidade) {
        if (cpf == null || !cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}")) {
            throw new IllegalArgumentException("Cpf no padrão incorreto!");
        }

        this.cpf = cpf;
        this.coren = coren;
        this.especialidade = especialidade;
        this.nome = nome;
    }

    public String getCoren() {
        return coren;
    }

    public void setCoren(String coren) {
        this.coren = coren;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
