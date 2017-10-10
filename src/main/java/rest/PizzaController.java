package rest;

import DTO.PizzaDTO;
import bo.PizzaBO;

import javax.ws.rs.POST;
import javax.ws.rs.*;

import javax.ws.rs.core.Response;

/**
 * Created by lucas on 27/07/2016.
 */

@Path("/pizza")
public class PizzaController {



    PizzaBO pizzaBO = new PizzaBO();


    @POST
    @Path("/salvar")
    @Consumes("application/json")
    @Produces("application/json")
    public Response salvar(PizzaDTO pizzaDTO) {

        PizzaDTO p = pizzaBO.salvar(pizzaDTO);

        return Response.status(200).entity(p).build();
    }



    @GET
    @Path("/lista")
    @Produces("application/json")
    public Response lista() {
        return Response.status(200).entity(pizzaBO.buscarTodos()).build();
    }

}
