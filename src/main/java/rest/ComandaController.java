package rest;

import DTO.ComandaDTO;
import bo.ComandaService;


import javax.ws.rs.*;
import javax.ws.rs.core.Response;

/**
 * Created by lucas on 01/09/2016.
 */

@Path("/comanda")
public class ComandaController {
    ComandaService comandaService = new ComandaService();


    @POST
    @Path("/salvar")
    @Produces("application/json")
    @Consumes("application/json")
    public Response Salvar(ComandaDTO comandaDTO) {


        return Response.status(200).build();

    }

    @GET
    @Path("/buscarcomanda")
    public Response BuscarTodos(){

        return Response.status(200).entity(comandaService.buscarTodos()).build();
    }




}
