package bo;

import Converter.BebidaConverter;
import DAO.BebidaDAO;
import DTO.BebidaDTO;
import DTO.PizzaDTO;
import Entity.Bebida;
import Entity.Pizza;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lucas on 19/04/2017.
 */
public class BebidaBO {
    private BebidaDAO bebidaDAO = new BebidaDAO();
    private BebidaConverter  bebidaConverter= new BebidaConverter();


    public BebidaDTO salvar(BebidaDTO bebidaDTO){
        Bebida bebida;
        bebida = bebidaConverter.converterParaEntity(bebidaDTO);
        return bebidaConverter.converterParaDTO(bebidaDAO.salvar(bebida));
    }

    public List<BebidaDTO> listarBebidas(){
        List<Bebida> bebidas = bebidaDAO.buscarTodos();
        List<BebidaDTO> bebidaDTOS = new ArrayList<>();

        for(Bebida bebida : bebidas){
            bebidaDTOS.add(bebidaConverter.converterParaDTO(bebida));
        }

        return bebidaDTOS;
    }

}
