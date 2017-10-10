package DAO;

import Entity.Mesa;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.List;

public class MesaDAO {
    EntityManager em;

    public MesaDAO(){
        em = JPAUtil.abreConexao();
    }

    public Mesa salvar(Mesa mesa){
     EntityTransaction tx = em.getTransaction();
     Mesa m;

     try {
         tx.begin();
         m = em.merge(mesa);
         tx.commit();
         return m;

     }catch (Exception e){
         e.printStackTrace();
         tx.rollback();
     }

     return null;
    }

    public Mesa buscarPorId(Mesa mesa){
      return em.find(Mesa.class, mesa);
    }

    public List<Mesa> busrcarTodos() {
        Query consulta = em.createQuery(" from Mesa m order by m.id");
        return consulta.getResultList();
    }
}
