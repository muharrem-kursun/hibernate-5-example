package hibernateEx.com.utıl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {
    private static final String PERSISTENCE_UNIT_NAME = "PERSISTENCE";

    private static EntityManagerFactory factory ;
    private static EntityManager entityManager ;

    public  static EntityManagerFactory getFactory ()
    {
        if(factory==null)
        {
            factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        }
        return factory;
    }

    public static void shutdown()
    {
        if(factory!=null)
        {
            factory.close();
        }
    }

    public static EntityManager getEntityManager() {
        return getFactory().createEntityManager();
    }
}
