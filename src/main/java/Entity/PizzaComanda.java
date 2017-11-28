package Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by lucas on 26/07/2016.
 */

@Entity
public class PizzaComanda implements Serializable {

    @Id
    @SequenceGenerator(name = "seq_pizza_comanda", sequenceName = "seq_pizza_comanda", allocationSize = 1)
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "seq_pizza_comanda" )
    @Column(name = "id_pizza_comanda")
    private int id;


    @ManyToOne
    @JoinColumn(name = "id_pizza")
    private Pizza pizza;

    @ManyToOne
    @JoinColumn(name = "id_comanda")
    private Comanda comanda;


    private Double valorPizza;

    public Comanda getComanda() {
        return comanda;
    }

    public void setComanda(Comanda comanda) {
        this.comanda = comanda;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public Double getValorPizza() {
        return valorPizza;
    }

    public void setValorPizza(Double valorPizza) {
        this.valorPizza = valorPizza;
    }
}
