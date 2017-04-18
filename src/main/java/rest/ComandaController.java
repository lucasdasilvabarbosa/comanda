package rest;

import DTO.ComandaDTO;
import bo.ComandaService;


import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.List;

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
    public Response salvar(ComandaDTO comandaDTO) {

        ComandaDTO c = comandaService.salvar(comandaDTO);
        return Response.status(200).entity(c).build();

    }

    @GET
    @Path("/buscarcomandas")
    @Produces("application/json")
    public Response BuscarTodos(){
        List<ComandaDTO> comandaDTOs = comandaService.buscarTodos();
        return Response.status(200).entity(comandaDTOs).build();
    }

    @GET
    @Path("buscarComanda/{idMesa}")
    @Produces("application/json")
    public Response buscarComanda(@PathParam("idMesa") int idMesa){

      return Response.status(200).entity(comandaService.buscarComandaMesa(idMesa)).build();
    }



}
