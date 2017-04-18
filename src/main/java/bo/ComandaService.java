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

    public ComandaDTO salvar(ComandaDTO comandaDTO){

        /**
         *esse metodo antes de salvar converte a comanda de dto para um obj Entity
         */
       Comanda c =  comandaDAO.salvar(comandaConverter.converterParaEntity(comandaDTO));
        return comandaConverter.converterParaDTO(c);
    }

    public List<ComandaDTO> buscarTodos(){
        List<ComandaDTO> comandaDTOs = new ArrayList<ComandaDTO>();
        List<Comanda> comandas = comandaDAO.buscarTodos();

         for(Comanda c : comandas){
             comandaDTOs.add(comandaConverter.converterParaDTO(c));

         }

        return comandaDTOs;
    }

    public ComandaDTO buscarComandaMesa(int id_mesa){
        Comanda comanda = comandaDAO.buscarComandaMesa(id_mesa);
        ComandaDTO comandaDTO = comandaConverter.converterParaDTO(comanda);

        return comandaDTO;
    }

}
