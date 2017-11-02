package rest;

import DTO.MesaDTO;
import Entity.Mesa;
import bo.MesaBO;
import org.jboss.logging.annotations.Pos;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/mesa")
public class MesaController {
    MesaBO mesaBO = new MesaBO();


    @POST
    @Path("/cria")
    @Consumes("application/json")
    @Produces("application/json")
    public Response inserirMesas(MesaDTO mesaDTO){
        return Response.status(200).entity(mesaBO.criarMesa(mesaDTO)).build();
    }



    @GET
    @Path("/lista")
    @Produces("application/json")
    public Response buscaMesas(){
        System.out.println("buscar mesas!");
        return Response.status(200).entity(mesaBO.buscarTodos()).build();
    }
}
