package com.upgrad.FoodOrderingApp.service.businness;

import com.upgrad.FoodOrderingApp.service.dao.ItemDao;
import com.upgrad.FoodOrderingApp.service.entity.ItemEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    @Autowired
    private ItemDao itemDao;

    public ItemEntity getItemByUUID(String uuid) {
        return itemDao.getItemByUUID(uuid);
    }
}
