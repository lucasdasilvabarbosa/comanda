package DTO;

/**
 * Created by lucas on 01/09/2016.
 */
public class BebidaComandaDTO {
    private int id;
    private int idBebida;
    private String descricaoBebida;
    private int idComanda;
    private double valorBebida;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdBebida() {
        return idBebida;
    }

    public void setIdBebida(int idBebida) {
        this.idBebida = idBebida;
    }

    public String getDescricaoBebida() {
        return descricaoBebida;
    }

    public void setDescricaoBebida(String descricaoBebida) {
        this.descricaoBebida = descricaoBebida;
    }

    public int getIdComanda() {
        return idComanda;
    }

    public void setIdComanda(int idComanda) {
        this.idComanda = idComanda;
    }

    public double getValorBebida() {
        return valorBebida;
    }

    public void setValorBebida(double valorBebida) {
        this.valorBebida = valorBebida;
    }
}
