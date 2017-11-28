package DTO;

import org.codehaus.jackson.annotate.JsonManagedReference;

import java.util.List;

/**
 * import org.codehaus.jackson.annotate.JsonBackReference;
   import org.codehaus.jackson.annotate.JsonIgnore;
   import org.codehaus.jackson.annotate.JsonManagedReference;
 *
 *
 * Created by lucas on 31/08/2016.
 */
public class ComandaDTO {
    private int id;
    private int idMesa;
    private Double valorComanda;
    @JsonManagedReference
    private List<PizzaComandaDTO> pizzaDTOs;
    @JsonManagedReference
    private List<BebidaComandaDTO> bebidaDTOs;

    public ComandaDTO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
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

    public Double getValorComanda() {
        return valorComanda;
    }

    public void setValorComanda(Double valorComanda) {
        this.valorComanda = valorComanda;
    }
}
