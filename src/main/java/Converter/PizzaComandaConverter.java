package Converter;

import DTO.BebidaComandaDTO;
import DTO.PizzaComandaDTO;
import Entity.Comanda;
import Entity.Pizza;
import Entity.PizzaComanda;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lucas on 01/09/2016.
 * <p>
 * Metodo que converte pizzaComanda tanto para entity quanto para DTOw
 */
public class PizzaComandaConverter {

    public PizzaComanda converterParaEntity(PizzaComandaDTO pizzaComandaDTO) {
        PizzaComanda pizzaComanda = new PizzaComanda();
        Comanda comanda = new Comanda();
        Pizza pizza = new Pizza();

        comanda.setId(pizzaComandaDTO.getIdComanda());
        pizza.setId(pizzaComandaDTO.getIdPizza());

        pizzaComanda.setId(pizzaComandaDTO.getId());
        pizzaComanda.setComanda(comanda);
        pizzaComanda.setPizza(pizza);
        pizzaComanda.setValorPizza(pizzaComandaDTO.getValorPizza());

        return pizzaComanda;
    }

    public PizzaComandaDTO converterParaDTO(PizzaComanda pizzaComanda) {
        PizzaComandaDTO pizzaComandaDTO = new PizzaComandaDTO();

        pizzaComandaDTO.setId(pizzaComanda.getId());
        pizzaComandaDTO.setIdComanda(pizzaComanda.getComanda().getId());
        pizzaComandaDTO.setIdPizza(pizzaComanda.getPizza().getId());
        pizzaComandaDTO.setSaborPizza(pizzaComanda.getPizza().getSabor());
        pizzaComandaDTO.setValorPizza(pizzaComanda.getValorPizza());

        return pizzaComandaDTO;
    }

    public List<PizzaComanda> converterListaParaEntity(List<PizzaComandaDTO> pizzaComandaDTOs) {
        List<PizzaComanda> pizzas = new ArrayList<>();

        for (PizzaComandaDTO p : pizzaComandaDTOs) {
            pizzas.add(converterParaEntity(p));
        }

        return pizzas;
    }

}
