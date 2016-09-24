package Converter;

import DTO.*;
import Entity.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lucas on 31/08/2016.
 */
public class ComandaConverter {
    private MesaConverter mesaConverter = new MesaConverter();
    private PizzaComandaConverter pizzaComandaConverter = new PizzaComandaConverter();
    private BebidaComandaConverter bebidaComandaConverter = new BebidaComandaConverter();

    public Comanda converterParaEntity(ComandaDTO comandaDTO) {
        Comanda comanda = new Comanda();
        Mesa mesa = new Mesa();
        mesa.setId(comandaDTO.getId_mesa());

        List<PizzaComanda> pizzas = new ArrayList<PizzaComanda>();
        List<BebidaComanda> bebidas = new ArrayList<BebidaComanda>();

        comanda.setId(comandaDTO.getId());
        comanda.setIdMesa(mesa);

         for(PizzaComandaDTO p : comandaDTO.getPizzaDTOs()){
              pizzas.add(pizzaComandaConverter.converterParaEntity(p));
         }

        for(BebidaComandaDTO b : comandaDTO.getBebidaDTOs()){
            bebidas.add(bebidaComandaConverter.converterParaEntity(b));
        }

        comanda.setPizzas(pizzas);
        comanda.setBebidas(bebidas);

        return comanda;
    }

    public ComandaDTO converterParaDTO(Comanda comanda){
      ComandaDTO comandaDTO = new ComandaDTO();




        return comandaDTO;

    }
}
