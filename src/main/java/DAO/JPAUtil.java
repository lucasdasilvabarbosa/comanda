package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by lucas on 27/07/2016.
 */
public class JPAUtil {

    private static final EntityManagerFactory emf;
    private static final EntityManager em;

    static {
        emf = Persistence.createEntityManagerFactory("persistence_comanda");
        em = emf.createEntityManager();
    }

    public static EntityManager abreConexao() {
        return em;
    }
}
