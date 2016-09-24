package Converter;

import DTO.BebidaComandaDTO;
import Entity.Bebida;
import Entity.BebidaComanda;
import Entity.Comanda;

/**
 * Created by lucas on 01/09/2016.
 */
public class BebidaComandaConverter {

    public BebidaComanda converterParaEntity(BebidaComandaDTO bebidaComandaDTO) {
        BebidaComanda bebidaComanda = new BebidaComanda();

        Comanda comanda = new Comanda();
        Bebida bebida = new Bebida();

        comanda.setId(bebidaComandaDTO.getIdComanda());
        bebida.setId(bebidaComandaDTO.getIdBebida());

        bebidaComanda.setId(bebidaComandaDTO.getId());
        bebidaComanda.setComanda(comanda);
        bebidaComanda.setBebida(bebida);

        return bebidaComanda;

    }

    public BebidaComandaDTO converterParaDTO(BebidaComanda bebidaComanda) {
        BebidaComandaDTO bebidaComandaDTO = new BebidaComandaDTO();



        return bebidaComandaDTO;
    }
}
