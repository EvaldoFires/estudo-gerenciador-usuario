package br.com.evaldo.estudo.gerenciador_usuario.infra.persistence.entities;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name="Paciente")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PacienteEntity {
    @Id
    private String cpf;
    private String nome;
    private String email;
    private LocalDate nascimento;
    @Embedded
    private EnderecoEntity endereco;
    private String dadosDeSaude;
}
