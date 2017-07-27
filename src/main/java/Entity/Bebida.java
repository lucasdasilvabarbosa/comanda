package Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by lucas on 25/07/2016.
 */

@Entity
public class Bebida implements Serializable {

    @Id
    @SequenceGenerator(name = "seq_bebida", sequenceName = "seq_bebida", allocationSize = 1)
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "seq_bebida" )
    @Column(name = "id_bebida")
    private int id;

    private String descricao;

    private Double valor;

//    @OneToMany(mappedBy = "bebida")
//    private List<BebidaComanda> bebidaComandas;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return "Bebida{" +
                "descricao='" + descricao + '\'' +
                ", valor=" + valor +
                '}';
    }
}
