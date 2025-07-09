package br.com.evaldo.estudo.gerenciador_usuario.infra.persistence.entities;

import br.com.evaldo.estudo.gerenciador_usuario.domain.valueobject.Endereco;
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
    private LocalDate nascimento;
    private String email;
    private Endereco endereco;
    private String dadosDeSaude;
}
