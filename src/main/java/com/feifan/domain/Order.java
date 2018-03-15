package com.feifan.domain;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * Created by Lidd on 2018/2/13.
 */
@Entity
@Table(name = "t_order")
public class Order {

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    @JoinColumn(referencedColumnName = "id")
    private Customer customer;

    private LocalDate deliverDate;

    private String orderNo;

    private String productNo;

    private String spec;

    private Integer count;

    private String comment;

    private String deliveryman;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDeliverDate() {
        return deliverDate;
    }

    public void setDeliverDate(LocalDate deliverDate) {
        this.deliverDate = deliverDate;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getProductNo() {
        return productNo;
    }

    public void setProductNo(String productNo) {
        this.productNo = productNo;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getDeliveryman() {
        return deliveryman;
    }

    public void setDeliveryman(String deliveryman) {
        this.deliveryman = deliveryman;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
