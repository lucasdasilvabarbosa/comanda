package rest;

import DTO.PizzaDTO;
import Entity.Pizza;
import bo.PizzaService;

import javax.ws.rs.POST;
import javax.ws.rs.*;

import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lucas on 27/07/2016.
 */

@Path("/pizza")
public class PizzaController {



    PizzaService pizzaService;


    @POST
    @Path("/salvar")
    @Consumes("application/json")
    @Produces("application/json")
    public Response salvar(PizzaDTO pizzaDTO) {

        pizzaService.salvar(pizzaDTO);

        return Response.status(200).entity(pizzaDTO).build();
    }

    List<Pizza> pizzas = new ArrayList<Pizza>();


    @GET
    @Path("/lista")
    @Produces("application/json")
    public Response lista() {
        return Response.status(200).entity(pizzaService.buscarTodos()).build();
    }

}
