package Entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by lucas on 25/07/2016.
 */

@Entity
public class Mesa {

    @Id
    @SequenceGenerator(name = "seq_mesa", sequenceName = "seq_mesa", initialValue = 1, allocationSize = 1)
    private int id;

    private int numeroDaMesa;

    private boolean comandaAberta;

    @OneToMany(mappedBy = "id_mesa")
    private List<Comanda> comandas;


    public Mesa(int id) {
        this.id = id;
    }

    public Mesa() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroDaMesa() {
        return numeroDaMesa;
    }

    public void setNumeroDaMesa(int numeroDaMesa) {
        this.numeroDaMesa = numeroDaMesa;
    }

    public boolean isComandaAberta() {
        return comandaAberta;
    }

    public void setComandaAberta(boolean comandaAberta) {
        this.comandaAberta = comandaAberta;
    }
}
