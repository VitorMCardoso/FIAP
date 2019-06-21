package br.com.fiap.mongodb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
@ToString
public class Pessoa {

    @Id
    private String id;
    private String nome;
    private List<Endereco> endereco;

    public Pessoa() {}
    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, List<Endereco> endereco) {
        super();
        this.nome = nome;
        this.endereco = endereco;
    }
}
