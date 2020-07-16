package com.tusu.santoecomerch.Pojo_Class;

public class Comments {

    private String  name,address,coments;

    public Comments(String name, String address, String coments) {
        this.name = name;
        this.address = address;
        this.coments = coments;
    }

    public Comments() {
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getComents() {
        return coments;
    }
}
