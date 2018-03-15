package com.feifan.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Lidd on 2018/2/13.
 */
@Entity
@Table(name = "t_paper")
public class Paper {

    @Id
    @GeneratedValue
    private Long id;

    private Integer paperSpec;

    private Float pricePerM2;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPaperSpec() {
        return paperSpec;
    }

    public void setPaperSpec(Integer paperSpec) {
        this.paperSpec = paperSpec;
    }

    public Float getPricePerM2() {
        return pricePerM2;
    }

    public void setPricePerM2(Float pricePerM2) {
        this.pricePerM2 = pricePerM2;
    }
}
