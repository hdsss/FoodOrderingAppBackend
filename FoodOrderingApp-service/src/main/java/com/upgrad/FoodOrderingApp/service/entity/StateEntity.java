package com.upgrad.FoodOrderingApp.service.entity;

import javax.persistence.Column;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "STATE")
@NamedQueries(
        {
                @NamedQuery(name = "stateByUuid", query = "select u from StateEntity u where u.uuid =:uuid"),

        }
)
public class StateEntity implements Serializable {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "UUID")
    @NotNull
    private String uuid;

    @Column(name = "STATE_NAME")
    @NotNull
    private String stateName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String state_name) {
        this.stateName = state_name;
    }
}
