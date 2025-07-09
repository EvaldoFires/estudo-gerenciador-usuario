package br.com.evaldo.estudo.gerenciador_usuario.infra.persistence.entities;

import br.com.evaldo.estudo.gerenciador_usuario.domain.models.enums.Especialidade;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Medico")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MedicoEntity {
    @Id
    private String cpf;
    private String nome;
    private String crm;
    private Especialidade especialidade;
}
