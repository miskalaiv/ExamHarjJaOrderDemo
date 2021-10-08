package com.miska.orderapp;

public class Product {
    private long id;
    private String name;


    private static long idCounter = 0;


    public Product(String name) {
        this.id = idCounter++;
        this.name = name;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}


