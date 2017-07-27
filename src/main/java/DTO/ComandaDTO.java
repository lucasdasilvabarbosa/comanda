package DTO;

import org.codehaus.jackson.annotate.JsonManagedReference;
import org.codehaus.jackson.annotate.JsonBackReference;

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
    private int id_mesa;
    @JsonManagedReference
    private List<PizzaComandaDTO> pizzaDTOs;
    @JsonManagedReference
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
