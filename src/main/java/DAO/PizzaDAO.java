package DAO;

import Entity.Pizza;

import javax.persistence.*;
import javax.persistence.EntityTransaction;
import java.util.List;

/**
 * Created by lucas on 27/07/2016.
 */

public class PizzaDAO {
    EntityManager em;

    public PizzaDAO(){
        em = JPAUtil.abreConexao();

    }

    public void salvar(Pizza pizza) {
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.merge(pizza);
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        }
    }

    public List<Pizza> buscarTodos(){
        Query consulta = em.createQuery("select p from Pizza p ORDER BY p.id");
        return consulta.getResultList();

    }
}
