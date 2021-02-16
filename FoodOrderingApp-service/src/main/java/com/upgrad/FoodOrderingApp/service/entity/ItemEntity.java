package com.upgrad.FoodOrderingApp.service.entity;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "item")
@NamedQueries({
        @NamedQuery(name = "itemByUuid", query = "select q from ItemEntity q where q.uuid = :uuid")
})
public class ItemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer Id;

    @NotNull
    @Column(name = "UUID")
    private String uuid;

    @NotNull
    @Column(name = "ITEM_NAME")
    private String itemName;

    @NotNull
    @Column(name = "PRICE")
    private Integer price;

    @NotNull
    @Column(name = "TYPE")
    private int type;

    @ManyToMany(mappedBy = "restaurantItems")
    private List<RestaurantEntity> restaurants;

    @ManyToMany(mappedBy = "categoryItems")
    private List<CategoryEntity> categories;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
