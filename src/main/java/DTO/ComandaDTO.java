package DTO;

import java.util.List;

/**
 * Created by lucas on 31/08/2016.
 */
public class ComandaDTO {
    private int id;
    private int id_mesa;
    private List<PizzaComandaDTO> pizzaDTOs;
    private List<BebidaComandaDTO> bebidaDTOs;

    public ComandaDTO() {
    }

    public ComandaDTO(int id_mesa) {
        this.id_mesa = id_mesa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_mesa() {
        return id_mesa;
    }

    public void setId_mesa(int id_mesa) {
        this.id_mesa = id_mesa;
    }

    public List<PizzaComandaDTO> getPizzaDTOs() {
        return pizzaDTOs;
    }

    public void setPizzaDTOs(List<PizzaComandaDTO> pizzaDTOs) {
        this.pizzaDTOs = pizzaDTOs;
    }

    public List<BebidaComandaDTO> getBebidaDTOs() {
        return bebidaDTOs;
    }

    public void setBebidaDTOs(List<BebidaComandaDTO> bebidaDTOs) {
        this.bebidaDTOs = bebidaDTOs;
    }
}
