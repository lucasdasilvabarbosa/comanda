package Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lucas on 25/07/2016.
 */

@Entity
public class Comanda implements Serializable{

    //@Generator(name = "seq_pedido", sequenceName = "seq_pedido", initialValue = 1, allocationSize = 1)

    @Id
    @SequenceGenerator( name = "comanda_seq", sequenceName = "comanda_seq", allocationSize = 1 )
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "comanda_seq" )
    @Column(name = "id_comanda")
    private int id;

    @JoinColumn(name = "id_mesa")
    @ManyToOne
    private Mesa id_mesa;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "comanda")
    private List<PizzaComanda> pizzas = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "comanda")
    private List<BebidaComanda> bebidas = new ArrayList<>();

    private Double valorComanda;

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

    public Mesa getMesa() {
        return id_mesa;
    }

    public void setMesa(Mesa idMesa) {
        this.id_mesa = idMesa;
    }

    public Double getValorComanda() {
        return valorComanda;
    }

    public void setValorComanda(Double valorComanda) {
        this.valorComanda = valorComanda;
    }
}
