package rest;

import DAO.UsuarioDAO;
import Entity.Usuario;
import com.sun.org.apache.regexp.internal.RE;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/usuario")
public class UsuarioController {
    UsuarioDAO usuarioDAO = new UsuarioDAO();

    @POST
    @Path("/login")
    @Produces("application/json")
    @Consumes("application/json")
    public Response login(Usuario usuarioApp){
        if (usuarioApp != null && usuarioApp.getLogin() != null){
           Usuario usuario = usuarioDAO.buscarPorLogin(usuarioApp);

           if(usuarioApp.getSenha() != null && !usuarioApp.getSenha().equals("")){
               if(usuarioApp.getSenha().equals(usuario.getSenha())){
                   return Response.status(200).entity(usuario).build();
               }else
                   return Response.status(400).build();
           }

        }
        return Response.status(500).build();
    }

}
