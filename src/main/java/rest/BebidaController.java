package rest;

import DTO.BebidaDTO;
import DTO.PizzaDTO;
import bo.BebidaService;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 * Created by lucas on 24/01/2017.
 */
@Path("/bebida")
public class BebidaController {
     BebidaService bebidaService = new BebidaService();

    @POST
    @Path("/salvar")
    @Consumes("application/json")
    @Produces("application/json")
    public Response salvar(BebidaDTO bebidaDTO) {

        BebidaDTO b = bebidaService.salvar(bebidaDTO);

        return Response.status(200).entity(b).build();
    }



}
