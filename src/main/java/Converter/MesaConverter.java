package Converter;

import DTO.MesaDTO;
import Entity.Mesa;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lucas on 31/08/2016.
 */
public class MesaConverter {

    public MesaDTO converterParaDTO(Mesa mesa){
        MesaDTO mesaDTO = new MesaDTO();

        mesaDTO.setId(mesa.getId());
        mesaDTO.setNumeroDaMesa(mesa.getNumeroDaMesa());
        mesaDTO.setComandaAberta(mesa.isComandaAberta());

        return mesaDTO;
    }

    public Mesa converterParaEntity(MesaDTO mesaDTO){
        Mesa mesa = new Mesa();

        mesa.setId(mesaDTO.getId());
        mesa.setComandaAberta(mesaDTO.isComandaAberta());
        mesa.setNumeroDaMesa(mesaDTO.getNumeroDaMesa());

        return mesa;

    }

    public List<MesaDTO> converterListaParaDTO(List<Mesa> mesas){
        List<MesaDTO> mesaDTOS = new ArrayList<>();

        for(Mesa mesa : mesas){
            mesaDTOS.add(converterParaDTO(mesa));
        }

        return mesaDTOS;
    }

}
