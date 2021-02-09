package com.chenddcoder.dddata;


import java.io.Serializable;

public class DDBeanProperty implements Serializable {

    private static final long serialVersionUID = 7827568409388171249L;
    private String name;
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
