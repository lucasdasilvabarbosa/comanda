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
        Mesa mesa = new Mesa(comandaDTO.getIdMesa());

        comanda.setId(comandaDTO.getId());
        comanda.setMesa(mesa);
        comanda.setValorComanda(comandaDTO.getValorComanda());


        return comanda;
    }

    public ComandaDTO converterParaDTO(Comanda comanda) {
        ComandaDTO comandaDTO = new ComandaDTO();
        comandaDTO.setIdMesa(comanda.getMesa().getId());


        List<PizzaComandaDTO> pizzaComandaDTOs = new ArrayList<PizzaComandaDTO>();
        List<BebidaComandaDTO> bebidaComandaDTOs = new ArrayList<BebidaComandaDTO>();

        for (PizzaComanda p : comanda.getPizzas()){
            pizzaComandaDTOs.add(pizzaComandaConverter.converterParaDTO(p));
        }

        for(BebidaComanda b : comanda.getBebidas()){
            bebidaComandaDTOs.add(bebidaComandaConverter.converterParaDTO(b));
        }

        comandaDTO.setId(comanda.getId());
        comandaDTO.setPizzaDTOs(pizzaComandaDTOs);
        comandaDTO.setBebidaDTOs(bebidaComandaDTOs);
        comandaDTO.setValorComanda(comanda.getValorComanda());

        return comandaDTO;

    }
}
