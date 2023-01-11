package br.com.grso.backendattornatus.domain.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity
@Table(name = "endereco")
public class Endereco implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String logradouro;

    private String CEP;

    private String numero;

    private String cidade;

}
