package repository;

import org.hibernate.Session;

import entity.BatchEntity;
import util.SessionFactoryConfiguration;

public class BatchRepository {

    private Session session = SessionFactoryConfiguration.getInstance().getSession();

    public BatchEntity get(Integer id) throws Exception{
        BatchEntity batchEntity = session.get(BatchEntity.class, id);
        return batchEntity;
    }

}
