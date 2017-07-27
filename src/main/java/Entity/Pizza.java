package Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by lucas on 25/07/2016.
 */

@Entity
public class Pizza implements Serializable {

    @Id
    @SequenceGenerator(name = "pizza_seq", sequenceName = "pizza_seq",  allocationSize = 1)
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "pizza_seq" )
    @Column(name = "id_pizza")
    private int id;

    private String sabor;

    private String descricao;

    private Double valor;

//    @OneToMany(mappedBy = "pizza")
//    private List<PizzaComanda> pizzaComandas;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "sabor='" + sabor + '\'' +
                ", descricao='" + descricao + '\'' +
                ", valor=" + valor +
                '}';
    }
}
