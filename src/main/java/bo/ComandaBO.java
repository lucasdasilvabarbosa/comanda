package bo;

import Converter.BebidaComandaConverter;
import Converter.ComandaConverter;
import Converter.PizzaComandaConverter;
import DAO.ComandaDAO;
import DTO.ComandaDTO;
import Entity.BebidaComanda;
import Entity.Comanda;
import Entity.Mesa;
import Entity.PizzaComanda;

import javax.enterprise.context.Dependent;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lucas on 31/08/2016.
 */

@Dependent
public class ComandaBO {

    private ComandaDAO comandaDAO = new ComandaDAO();
    private ComandaConverter comandaConverter = new ComandaConverter();
    private PizzaComandaConverter pizzaComandaConverter = new PizzaComandaConverter();
    private BebidaComandaConverter bebidaComandaConverter = new BebidaComandaConverter();

    public ComandaDTO criaComanda(Mesa mesa) {
        Comanda c = new Comanda();

        mesa.setComandaAberta(true);
        c.setMesa(mesa);
        return comandaConverter.converterParaDTO(comandaDAO.salvar(c));
    }


    public ComandaDTO salvar(ComandaDTO comandaDTO) {
 /*
 *esse metodo antes de salvar converte a comanda de dto para um obj Entity
  **/
        List<PizzaComanda> pizzaComandas = pizzaComandaConverter.converterListaParaEntity(comandaDTO.getPizzaDTOs());
        List<PizzaComanda> pizzasAux = new ArrayList<>();
        List<BebidaComanda> bebidaComandas = bebidaComandaConverter.converterListaParaEntity(comandaDTO.getBebidaDTOs());
        List<BebidaComanda> bebidasAux = new ArrayList<>();
        comandaDTO.setBebidaDTOs(null);
        comandaDTO.setPizzaDTOs(null);

        Comanda c = comandaDAO.salvar(comandaConverter.converterParaEntity(comandaDTO));

        for (PizzaComanda p : pizzaComandas) {
            p.getComanda().setId(c.getId());
            pizzasAux.add(p);
        }

        for (BebidaComanda b : bebidaComandas) {
            b.getComanda().setId(c.getId());
            bebidasAux.add(b);
        }
        c.setPizzas(pizzasAux);
        c.setBebidas(bebidasAux);
        Comanda comandaAux = comandaDAO.salvar(c);

        return comandaConverter.converterParaDTO(comandaAux);
    }

    public List<ComandaDTO> buscarTodos() {
        List<ComandaDTO> comandaDTOs = new ArrayList<ComandaDTO>();
        List<Comanda> comandas = comandaDAO.buscarTodos();

        for (Comanda c : comandas) {
            comandaDTOs.add(comandaConverter.converterParaDTO(c));

        }

        return comandaDTOs;
    }

    public ComandaDTO buscarComandaMesa(int id_mesa) {
        Comanda comanda = comandaDAO.buscarComandaMesa(id_mesa);
        ComandaDTO comandaDTO = comandaConverter.converterParaDTO(comanda);

        return comandaDTO;
    }

}
