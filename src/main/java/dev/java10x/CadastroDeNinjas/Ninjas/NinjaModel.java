package dev.java10x.CadastroDeNinjas.Ninjas;

import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//entity tranforma  uma  classe em uma entidade do banco de dados
// JPA = JAVA PERSISTENCE API
//GeneratedValue = a forma numerica de como ficaram salvos os id
@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    private int idade;

    // @manytoone - um ninja tem uma unica missão
    @ManyToOne
    @JoinColumn(name = "missoes_id")// foreing key or chave estrangeira
    private MissoesModel missoes;



}
