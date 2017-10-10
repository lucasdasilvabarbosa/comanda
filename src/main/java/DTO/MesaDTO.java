package DTO;

import Entity.Mesa;

/**
 * Created by lucas on 24/08/2016.
 */
public class MesaDTO {
    private int id;

    private int numeroDaMesa;

    private boolean comandaAberta;

    public MesaDTO() {
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
