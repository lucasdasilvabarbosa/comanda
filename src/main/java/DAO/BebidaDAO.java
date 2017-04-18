package DAO;

import javax.persistence.Entity;
import javax.persistence.EntityManager;

/**
 * Created by lucas on 24/01/2017.
 */
public class BebidaDAO {

    EntityManager em;

    public BebidaDAO(){
        em = JPAUtil.abreConexao();
    }



}
