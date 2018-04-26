package DAO;

import Entity.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class UsuarioDAO {
    EntityManager em;

    public UsuarioDAO(){
        em = JPAUtil.abreConexao();
    }

    public Usuario buscarPorLogin(Usuario usuarioApp){

        Query query = em.createQuery("select u from Usuario u where u.login =:login and u.acesso_aplicativo = true");
        query.setParameter("login", usuarioApp.getLogin());
        Usuario usuario = (Usuario) query.getSingleResult();
        return usuario;
    }

}
