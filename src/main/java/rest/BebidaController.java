package rest;

import DTO.BebidaDTO;
import bo.BebidaBO;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

/**
 * Created by lucas on 24/01/2017.
 */
@Path("/bebida")
public class BebidaController {
     BebidaBO bebidaBO = new BebidaBO();

    @POST
    @Path("/salvar")
    @Consumes("application/json")
    @Produces("application/json")
    public Response salvar(BebidaDTO bebidaDTO) {

        BebidaDTO b = bebidaBO.salvar(bebidaDTO);

        return Response.status(200).entity(b).build();
    }

    @GET
    @Path("/lista")
    @Produces("application/json")
    public Response lista(){
        return Response.status(200).entity(bebidaBO.listarBebidas()).build();
    }



}
