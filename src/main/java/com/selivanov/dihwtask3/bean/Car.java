package com.selivanov.dihwtask3.bean;

import java.math.BigDecimal;
import java.sql.Date;

public class Car {
    private Integer id;
    private String model;
    private BigDecimal price;
    private String owner;
    private java.sql.Date year;

    public Car(Integer id, String model, BigDecimal price, String owner, Date year) {
        this.id = id;
        this.model = model;
        this.price = price;
        this.owner = owner;
        this.year = year;
    }

    public Integer getId () {
        return id;
    }

    public String getModel() {
        return model;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getOwner() {
        return owner;
    }

    public java.sql.Date getYear() {
        return (java.sql.Date) year;
    }
}
