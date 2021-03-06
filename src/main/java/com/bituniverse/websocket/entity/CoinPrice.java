package com.bituniverse.websocket.entity;

import java.io.Serializable;

public class CoinPrice implements Serializable {
    private static final long serialVersionUID = 1751639438263721134L;

    private Integer id;

    private Integer c1;

    private Integer c2;

    private Integer exchangeId;

    private String price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getC1() {
        return c1;
    }

    public void setC1(Integer c1) {
        this.c1 = c1;
    }

    public Integer getC2() {
        return c2;
    }

    public void setC2(Integer c2) {
        this.c2 = c2;
    }

    public Integer getExchangeId() {
        return exchangeId;
    }

    public void setExchangeId(Integer exchangeId) {
        this.exchangeId = exchangeId;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", id=").append(id);
        sb.append(", c1=").append(c1);
        sb.append(", c2=").append(c2);
        sb.append(", exchangeId=").append(exchangeId);
        sb.append(", price=").append(price);
        sb.append("]");
        return sb.toString();
    }
}