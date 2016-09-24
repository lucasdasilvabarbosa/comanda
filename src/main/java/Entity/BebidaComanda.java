package Entity;

import javax.persistence.*;

/**
 * Created by lucas on 26/07/2016.
 */

@Entity
public class BebidaComanda {
    @Id
    @SequenceGenerator(name = "seq_bebida_comanda", sequenceName = "seq_pedido", initialValue = 1, allocationSize = 1)
    @Column(name = "id_bebida_comanda")
    private int id;


    @ManyToOne
    @JoinColumn(name = "id_bebida")
    private Bebida bebida;

    @ManyToOne
    @JoinColumn(name = "id_comanda")
    private Comanda comanda;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Bebida getBebida() {
        return bebida;
    }

    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    }

    public Comanda getComanda() {
        return comanda;
    }

    public void setComanda(Comanda comanda) {
        this.comanda = comanda;
    }
}

