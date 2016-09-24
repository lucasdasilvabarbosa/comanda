package Entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by lucas on 25/07/2016.
 */

@Entity
public class Pizza {

    @Id
    @SequenceGenerator(name = "seq_pizza", sequenceName = "seq_pizza", initialValue = 1, allocationSize = 1)
    @Column(name = "id_pizza")
    private int id;

    private String sabor;

    private String descricao;

    private Double valor;

    @OneToMany(mappedBy = "pizza")
    private List<PizzaComanda> pizzaComandas;

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
