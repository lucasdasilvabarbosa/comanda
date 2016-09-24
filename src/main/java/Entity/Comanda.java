package Entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by lucas on 25/07/2016.
 */

@Entity
public class Comanda {
    @Id
    @SequenceGenerator(name = "seq_pedido", sequenceName = "seq_pedido", initialValue = 1, allocationSize = 1)
    @Column(name = "id_comanda")
    private int id;

    @JoinColumn(name = "id_mesa")
    @ManyToOne
    private Mesa id_mesa;

    @OneToMany(mappedBy = "comanda", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<PizzaComanda> pizzas;

    @OneToMany(mappedBy = "comanda", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<BebidaComanda> bebidas;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<BebidaComanda> getBebidas() {
        return bebidas;
    }

    public void setBebidas(List<BebidaComanda> bebidas) {
        this.bebidas = bebidas;
    }

    public List<PizzaComanda> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<PizzaComanda> pizzas) {
        this.pizzas = pizzas;
    }

    public Mesa getIdMesa() {
        return id_mesa;
    }

    public void setIdMesa(Mesa idMesa) {
        this.id_mesa = idMesa;
    }
}
