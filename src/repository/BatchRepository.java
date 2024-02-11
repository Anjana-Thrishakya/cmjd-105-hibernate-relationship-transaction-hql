package repository;

import org.hibernate.Session;

import entity.BatchEntity;

public class BatchRepository {

    public BatchEntity get(Integer id, Session session) throws Exception{
        BatchEntity batchEntity = session.get(BatchEntity.class, id);
        return batchEntity;
    }

}
