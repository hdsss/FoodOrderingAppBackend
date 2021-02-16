package com.upgrad.FoodOrderingApp.service.dao;

import com.upgrad.FoodOrderingApp.service.entity.ItemEntity;
import com.upgrad.FoodOrderingApp.service.entity.OrderItemEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class ItemDao {

    @PersistenceContext
    private EntityManager entityManager;

    public ItemEntity getItemByUUID(String uuid) {
        return entityManager.createNamedQuery("itemByUuid", ItemEntity.class).
                setParameter("uuid", uuid).getSingleResult();
    }
}
