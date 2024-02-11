package repository;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.LaptopEntity;
import util.SessionFactoryConfiguration;

public class LaptopRepository {

    private Session session = SessionFactoryConfiguration.getInstance().getSession();

    public Integer save(LaptopEntity laptopEntity) throws Exception{
        Transaction transaction = session.beginTransaction();

        try {
            Integer id=  (Integer)session.save(laptopEntity);
            transaction.commit();
            return id;
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
            return -1;
        }
    }
}
