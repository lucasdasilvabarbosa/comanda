package Converter;

import DTO.BebidaComandaDTO;
import Entity.Bebida;
import Entity.BebidaComanda;
import Entity.Comanda;

import java.util.ArrayList;
import java.util.List;

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
        bebidaComandaDTO.setId(bebidaComanda.getId());
        bebidaComandaDTO.setIdBebida(bebidaComanda.getBebida().getId());
        bebidaComandaDTO.setDescricaoBebida(bebidaComanda.getBebida().getDescricao());
        bebidaComandaDTO.setValor(bebidaComanda.getBebida().getValor());


        return bebidaComandaDTO;
    }

    public List<BebidaComanda> converterListaParaEntity(List<BebidaComandaDTO> bebidaComandaDTOs){
        List<BebidaComanda> bebidas = new ArrayList<>();

        for (BebidaComandaDTO b : bebidaComandaDTOs) {
            bebidas.add(converterParaEntity(b));
        }

        return bebidas;
    }

}
