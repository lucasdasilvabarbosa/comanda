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

    public Comanda salvar(Comanda comanda) {
        EntityTransaction tx = em.getTransaction();
        Comanda c;
        try {
            tx.begin();
            c =  em.merge(comanda);
            tx.commit();
            return c;
        } catch (Exception e) {
            tx.rollback();
        }
        return null;
    }

    public List<Comanda> buscarTodos() {
        //JPQL
        Query consulta = em.createQuery("select c from Comanda c ORDER BY c.id");
        return consulta.getResultList();
    }


    public Comanda buscarComandaMesa(int idMesa){
        Query consulta = em.createQuery("select c from Comanda c " +
                                           "inner join c.id_mesa m" +
                                           " WHERE m.id =:idMesa and c.comandaFinalizada = FALSE");
                consulta.setParameter("idMesa", idMesa);;
        Comanda comanda = (Comanda) consulta.getSingleResult();
        System.out.println("Buscar Comanda da mesa: "+idMesa+" comanda: "+comanda.getId());
        return (Comanda) consulta.getSingleResult();
    }
}
