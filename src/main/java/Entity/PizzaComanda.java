package Entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by lucas on 26/07/2016.
 */

@Entity
public class PizzaComanda {

    @Id
    @SequenceGenerator(name = "seq_pizza_comanda", sequenceName = "seq_pedido", initialValue = 1, allocationSize = 1)
    @Column(name = "id_pizza_comanda")
    private int id;


    @ManyToOne
    @JoinColumn(name = "id_pizza")
    private Pizza pizza;

    @ManyToOne
    @JoinColumn(name = "id_comanda")
    private Comanda comanda;

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
}
