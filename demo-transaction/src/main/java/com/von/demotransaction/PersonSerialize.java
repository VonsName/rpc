package com.von.demotransaction;

import java.io.Serializable;

/**
 * @author ： fjl
 * @date ： 2019/5/24/024 14:13
 */
public class PersonSerialize implements Serializable {
    private static final long serialVersionUID = 4992921202712032967L;

    private String name;
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "PersonSerialize{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
