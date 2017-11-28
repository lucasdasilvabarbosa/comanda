package DAO;

import javax.persistence.Entity.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import Entity.Bebida;

import java.util.List;

/**
 * Created by lucas on 24/01/2017.
 */
public class BebidaDAO {

    EntityManager em;

    public BebidaDAO() {
        em = JPAUtil.abreConexao();
    }

    public Bebida salvar(Bebida bebida) {
        EntityTransaction tx = em.getTransaction();
        Bebida b;
        try {
            tx.begin();
            b = em.merge(bebida);
            tx.commit();
            return b;
        } catch (Exception e) {
            tx.rollback();
        }
        return null;
    }

    public List<Bebida> buscarTodos(){
        Query consulta = em.createQuery("from Bebida b order by b.descricao");
        return consulta.getResultList();
    }

}
