package bo;

import Converter.PizzaConverter;
import DAO.PizzaDAO;
import DTO.PizzaDTO;
import Entity.Pizza;

import javax.enterprise.context.Dependent;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lucas on 31/08/2016.
 */

@Dependent
public class PizzaService {

   private PizzaDAO pizzaDAO = new PizzaDAO();
   private PizzaConverter pizzaConverter = new PizzaConverter();

   public PizzaDTO salvar(PizzaDTO pizzaDTO){
       Pizza p;
       p  = pizzaDAO.salvar(pizzaConverter.converterParaEntity(pizzaDTO));

       return pizzaConverter.converterParaDTO(p);
   }

   public List<PizzaDTO> buscarTodos(){
       List<Pizza> pizzas = pizzaDAO.buscarTodos();
       List<PizzaDTO> pizzaDTOs = new ArrayList<PizzaDTO>();

       for(Pizza p : pizzas){
           pizzaDTOs.add(pizzaConverter.converterParaDTO(p));
       }

       return pizzaDTOs;
   }


}
