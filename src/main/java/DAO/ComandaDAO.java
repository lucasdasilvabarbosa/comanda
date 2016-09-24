package DAO;

import Entity.Comanda;
import Entity.Pizza;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by lucas on 31/08/2016.
 */
public class ComandaDAO {
    EntityManager em;

    public ComandaDAO() {
        em = JPAUtil.abreConexao();

    }

    public void salvar(Comanda comanda) {
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.merge(comanda);
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        }
    }

    public List<Comanda> buscarTodos() {
        //JPQL
        Query consulta = em.createQuery("select c from Comanda c ORDER BY c.id");
        return consulta.getResultList();
    }

}
