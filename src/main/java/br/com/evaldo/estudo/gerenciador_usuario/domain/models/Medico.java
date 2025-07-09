package br.com.evaldo.estudo.gerenciador_usuario.domain.models;

import br.com.evaldo.estudo.gerenciador_usuario.domain.models.enums.Especialidade;

public class Medico {
    private String cpf;
    private String nome;
    private String crm;
    private Especialidade especialidade;

    public Medico(String cpf, String crm, Especialidade especialidade, String nome) {
        if (cpf == null || !cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}")) {
            throw new IllegalArgumentException("Cpf no padrão incorreto!");
        }

        this.cpf = cpf;
        this.crm = crm;
        this.especialidade = especialidade;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
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
