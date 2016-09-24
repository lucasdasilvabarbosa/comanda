package Converter;

import DTO.PizzaDTO;
import Entity.Pizza;

/**
 * Created by lucas on 24/08/2016.
 */
public class PizzaConverter {

    public Pizza converterParaEntity(PizzaDTO pizzaDTO) {
        Pizza pizza = new Pizza();
        pizza.setId(pizzaDTO.getId());
        pizza.setSabor(pizzaDTO.getSabor());
        pizza.setValor(pizzaDTO.getValor());
        return pizza;
    }

    public PizzaDTO converterParaDTO(Pizza pizza) {
        PizzaDTO pizzaDTO = new PizzaDTO();

        pizzaDTO.setId(pizza.getId());
        pizzaDTO.setSabor(pizza.getSabor());
        pizzaDTO.setValor(pizza.getValor());

        return pizzaDTO;
    }
}
