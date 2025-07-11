package br.com.evaldo.estudo.gerenciador_usuario.infra.persistence.entities;

import br.com.evaldo.estudo.gerenciador_usuario.domain.models.enums.Tipo;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Hospital")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class HospitalEntity {

    @Id
    private Long id;
    private String nome;
    @Embedded
    private EnderecoEntity endereco;
    private Tipo tipo;

}
