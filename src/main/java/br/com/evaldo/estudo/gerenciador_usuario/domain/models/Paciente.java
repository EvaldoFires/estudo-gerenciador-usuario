package br.com.evaldo.estudo.gerenciador_usuario.domain.models;

import br.com.evaldo.estudo.gerenciador_usuario.domain.valueobject.Endereco;

import java.time.LocalDate;

public class Paciente {

    private String cpf;
    private String nome;
    private String email;
    private LocalDate nascimento;
    private Endereco endereco;
    private String dadosDeSaude;

    public Paciente(String cpf, String nome, String email, LocalDate nascimento,
                    Endereco endereco, String dadosDeSaude) {

        if (cpf == null || !cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}")) {
            throw new IllegalArgumentException("Cpf no padrão incorreto!");
        }

        this.cpf = cpf;
        this.dadosDeSaude = dadosDeSaude;
        this.email = email;
        this.endereco = endereco;
        this.nascimento = nascimento;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDadosDeSaude() {
        return dadosDeSaude;
    }

    public void setDadosDeSaude(String dadosDeSaude) {
        this.dadosDeSaude = dadosDeSaude;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
