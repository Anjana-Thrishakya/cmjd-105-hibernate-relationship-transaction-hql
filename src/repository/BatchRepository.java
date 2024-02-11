package repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import entity.BatchEntity;

public class BatchRepository {

    public BatchEntity get(Integer id, Session session) throws Exception{
        BatchEntity batchEntity = session.get(BatchEntity.class, id);
        return batchEntity;
    }

    public List<BatchEntity> getAll(Session session){
        String hql = "FROM BatchEntity";
        Query query = session.createQuery(hql);
        List<BatchEntity> batchEntities = query.list();
        return batchEntities;
    }

}
