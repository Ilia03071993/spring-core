package com.selivanov.dihwtask3.bean;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;

public class Car {
    private Integer id;
    private String model;
    private String owner;
    private BigDecimal price;

    private LocalDate date;

    public Car(Integer id, String model, String owner, BigDecimal price, LocalDate date) {
        this.id = id;
        this.model = model;
        this.owner = owner;
        this.price = price;
        this.date = date;
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

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", owner='" + owner + '\'' +
                ", price=" + price +
                ", year=" + date +
                '}';
    }
}
