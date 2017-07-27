package DTO;

import java.io.Serializable;

/**
 * Created by lucas on 24/08/2016.
 */
public class PizzaDTO implements Serializable{
    private int id;
    private String sabor;
    private String descricao;
    private Double valor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSabor() {
        return sabor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
