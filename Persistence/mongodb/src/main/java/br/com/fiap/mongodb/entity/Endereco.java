package br.com.fiap.mongodb.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;

@Data
@ToString
public class Endereco {

    @Id
    private String id;
    private String rua;
    private String cidade;

    public Endereco() {
        super();
    }

    public Endereco(String rua, String cidade) {
        super();
        this.rua = rua;
        this.cidade = cidade;
    }
}
