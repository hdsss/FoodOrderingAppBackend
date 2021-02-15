package com.upgrad.FoodOrderingApp.service.dao;

import com.upgrad.FoodOrderingApp.service.entity.*;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

@Repository
public class AddressDao {

    @PersistenceContext
    private EntityManager entityManager;

    public StateEntity getState(String uuid){
        try {
            return entityManager.createNamedQuery("stateByUuid", StateEntity.class).setParameter("uuid",uuid)
                    .getSingleResult();
        }
        catch (NoResultException nre){
            return null;
        }
    }

    public AddressEntity createAddress(AddressEntity addressEntity){
        entityManager.persist(addressEntity);
        return addressEntity;
    }
    public CustomerAddressEntity setCustomerAddress(CustomerAddressEntity addressEntity){
        entityManager.persist(addressEntity);
        return addressEntity;
    }


}
