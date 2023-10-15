package com.selivanov.dihwtask3.bean;

import java.math.BigDecimal;
import java.sql.Date;

public class Car {
    private Integer id;
    private String model;
    private String owner;
    private BigDecimal price;

    private java.sql.Date year;

    public Car(Integer id, String model, String owner, BigDecimal price, Date year) {
        this.id = id;
        this.model = model;
        this.owner = owner;
        this.price = price;
        this.year = year;
    }

    public Integer getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getOwner() {
        return owner;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public java.sql.Date getYear() {
        return (java.sql.Date) year;
    }
}
