package com.chenxiaohui.homework2.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.joda.money.Money;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Coffee {
    private Long id;
    private String name;
    private Money price;
    private Date createTime;
    private Date updateTime;

    public Coffee(Long id, String name, Money price, Date createTime, Date updateTime) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Coffee() {
    }

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

    public Money getPrice() {
        return price;
    }

    public void setPrice(Money price) {
        this.price = price;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "id=" + id +
                ", name=" + name +
                ", price=" + price +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
