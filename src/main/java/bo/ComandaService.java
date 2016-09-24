package bo;

import Converter.ComandaConverter;
import DAO.ComandaDAO;
import DTO.ComandaDTO;
import Entity.Comanda;

import javax.enterprise.context.Dependent;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lucas on 31/08/2016.
 */

@Dependent
public class ComandaService {

    private  ComandaDAO comandaDAO = new ComandaDAO();
    private  ComandaConverter comandaConverter = new ComandaConverter();

    public void salvar(ComandaDTO comandaDTO){

        /**
         *esse metodo antes de salvar converte a comanda de dto para um obj Entity
         */
         comandaDAO.salvar(comandaConverter.converterParaEntity(comandaDTO));

    }

    public List<ComandaDTO> buscarTodos(){
        List<ComandaDTO> comandaDTOs = new ArrayList<ComandaDTO>();
        List<Comanda> comandas = comandaDAO.buscarTodos();

         for(Comanda c : comandas){
             comandaDTOs.add(comandaConverter.converterParaDTO(c));

         }

        return comandaDTOs;
    }


}
