package rest;

import DTO.ComandaDTO;
import DTO.MesaDTO;
import bo.ComandaBO;
import bo.MesaBO;


import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by lucas on 01/09/2016.
 */

@Path("/comanda")
public class ComandaController {
    ComandaBO comandaBO = new ComandaBO();
    MesaBO mesaBO = new MesaBO();

    @POST
    @Path("/salvar")
    @Produces("application/json")
    @Consumes("application/json")
    public Response salvar(ComandaDTO comandaDTO) {

        ComandaDTO c = comandaBO.salvar(comandaDTO);
        return Response.status(200).entity(c).build();

    }

    @GET
    @Path("/buscarcomandas")
    @Produces("application/json")
    public Response BuscarTodos(){
        List<ComandaDTO> comandaDTOs = comandaBO.buscarTodos();
        return Response.status(200).entity(comandaDTOs).build();
    }

    @GET
    @Path("/buscarcomanda/{idMesa}")
    @Produces("application/json")
    public Response buscarComanda(@PathParam("idMesa") int idMesa){

      return Response.status(200).entity(comandaBO.buscarComandaMesa(idMesa)).build();
    }

    @POST
    @Path("cria")
    @Consumes("application/json")
    @Produces("application/json")
    public Response criaComanda(MesaDTO mesaDTO){
        return Response.status(200).entity(mesaBO.criarComanda(mesaDTO)).build();
    }


}
