package com.seapay.rest.seapaycatalog.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

@Table
@Entity
public class Item implements Serializable {
    @Id
    @GeneratedValue
    @Column(updatable = false)
    private Integer id;

    @Column
    private String name;

    @Column
    private BigDecimal price;

    public Item() {

    }

    public Item(String name, BigDecimal price, Integer totalStock) {
        this.name = name;
        this.price = price;
        this.totalStock = totalStock;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getTotalStock() {
        return totalStock;
    }

    public void setTotalStock(Integer totalStock) {
        this.totalStock = totalStock;
    }

    @Column
    private Integer totalStock;
}
