package Entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by lucas on 26/07/2016.
 */

@Entity
public class BebidaComanda implements Serializable {
    @Id
    @SequenceGenerator(name = "seq_bebida_comanda", sequenceName = "seq_bebida_comanda", allocationSize = 1)
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "seq_bebida_comanda" )
    @Column(name = "id_bebida_comanda")
    private int id;


    @ManyToOne
    @JoinColumn(name = "id_bebida")
    private Bebida bebida;

    @ManyToOne
    @JoinColumn(name = "id_comanda")
    private Comanda comanda;

    private Double valorBebida;

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

    public Double getValorBebida() {
        return valorBebida;
    }

    public void setValorBebida(Double valorBebida) {
        this.valorBebida = valorBebida;
    }
}

