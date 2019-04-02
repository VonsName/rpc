package com.von.rpc.spring;

import java.math.BigDecimal;

/**
 * @author ： fjl
 * @date ： 2019/4/2/002 10:17
 */
public class Book {

    private String no;
    private String name;
    private BigDecimal price;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
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
}
