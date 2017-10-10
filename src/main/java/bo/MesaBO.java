package bo;

import Converter.MesaConverter;
import DAO.MesaDAO;
import DTO.ComandaDTO;
import DTO.MesaDTO;
import Entity.Mesa;

import java.util.List;

public class MesaBO {
    MesaDAO mesaDAO = new MesaDAO();
    ComandaBO comandaBO = new ComandaBO();
    MesaConverter mesaConverter = new MesaConverter();

    public ComandaDTO criarComanda(MesaDTO mesaDTO){
      Mesa mesa = mesaConverter.converterParaEntity(mesaDTO);

      if(!mesa.isComandaAberta()){
         mesa.setComandaAberta(true);
         return comandaBO.criaComanda(mesa);
      }

      return comandaBO.buscarComandaMesa(mesa.getId());
    }


    public List<MesaDTO> buscarTodos() {
        return mesaConverter.converterListaParaDTO(mesaDAO.busrcarTodos());
    }

    public MesaDTO criarMesa(MesaDTO mesaDTO){
       return mesaConverter.converterParaDTO(mesaDAO.salvar(mesaConverter.converterParaEntity(mesaDTO)));
    }
}
