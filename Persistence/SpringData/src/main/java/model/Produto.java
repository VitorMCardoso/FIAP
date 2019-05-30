package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Produto {
    @Id
    public Integer id;
    public String nome;

    public Produto() {

    }

    public Produto(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
