package Converter;

import DTO.BebidaDTO;
import Entity.Bebida;

/**
 * Created by lucas on 29/08/2016.
 */
public class BebidaConverter {

    public Bebida converterParaEntity(BebidaDTO bebidaDTO){
       Bebida bebida = new Bebida();

        bebida.setValor(bebidaDTO.getValor());
        bebida.setDescricao(bebidaDTO.getDescricao());
        bebida.setId(bebidaDTO.getId());

        return bebida;
    }


    public BebidaDTO converterParaDTO(Bebida bebida){
        BebidaDTO bebidaDTO = new BebidaDTO();

        bebidaDTO.setId(bebida.getId());
        bebidaDTO.setValor(bebida.getValor());
        bebidaDTO.setDescricao(bebida.getDescricao());

        return bebidaDTO;
    }


}
