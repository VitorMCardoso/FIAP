import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="itens")
public class Item implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="ID")
    private int id;

    @Column(name="QUANTIDADE")
    private double quantidade;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumns({@JoinColumn(name="NUMPEDIDO",referencedColumnName="NUMPEDIDO"),
            @JoinColumn(name="CATEGORIA",referencedColumnName="CATEGORIA")})
    private Pedido pedido;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}
