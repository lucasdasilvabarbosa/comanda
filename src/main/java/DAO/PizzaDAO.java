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

    public PizzaDAO() {
        em = JPAUtil.abreConexao();

    }

    public Pizza salvar(Pizza pizza) {
        EntityTransaction tx = em.getTransaction();
        Pizza p;
        try {
            tx.begin();
            p = em.merge(pizza);
            tx.commit();
            return p;
        } catch (Exception e) {
            tx.rollback();
            e.getStackTrace();
        }
        return null;
    }

    public List<Pizza> buscarTodos() {
        Query consulta = em.createQuery("select p from Pizza p ORDER BY p.sabor");
        System.out.println("listar pizzas");
        return consulta.getResultList();

    }
}
