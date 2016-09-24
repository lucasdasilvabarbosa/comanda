package Entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by lucas on 25/07/2016.
 */

@Entity
public class Bebida {

    @Id
    @SequenceGenerator(name = "seq_bebida", sequenceName = "seq_bebida", initialValue = 1, allocationSize = 1)
    @Column(name = "id_bebida")
    private int id;

    private String descricao;

    private Double valor;

    @OneToMany(mappedBy = "bebida", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<BebidaComanda> bebidaComandas;

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
