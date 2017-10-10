package bo;

import Converter.BebidaConverter;
import DAO.BebidaDAO;
import DTO.BebidaDTO;
import DTO.PizzaDTO;
import Entity.Bebida;
import Entity.Pizza;

/**
 * Created by lucas on 19/04/2017.
 */
public class BebidaBO {
    private BebidaDAO bebidaDAO = new BebidaDAO();
    private BebidaConverter  bebidaConverter= new BebidaConverter();

    public BebidaDTO salvar(BebidaDTO bebidaDTO){
        Bebida bebida =  new Bebida();
        bebida = bebidaConverter.converterParaEntity(bebidaDTO);
        return bebidaConverter.converterParaDTO(bebidaDAO.salvar(bebida));
    }


}
