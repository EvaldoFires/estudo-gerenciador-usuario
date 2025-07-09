package br.com.evaldo.estudo.gerenciador_usuario.infra.persistence.entities;

import br.com.evaldo.estudo.gerenciador_usuario.domain.models.enums.Tipo;
import br.com.evaldo.estudo.gerenciador_usuario.domain.valueobject.Endereco;
import jakarta.persistence.Entity;
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

    private Long id;
    private String nome;
    private Endereco endereco;
    private Tipo tipo;

}
