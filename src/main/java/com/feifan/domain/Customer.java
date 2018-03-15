package com.feifan.domain;

import javax.persistence.*;

/**
 * Created by Lidd on 2018/2/13.
 */
@Table(name = "t_customer")
@Entity
public class Customer {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
