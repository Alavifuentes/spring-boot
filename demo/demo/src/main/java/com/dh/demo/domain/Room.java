package com.dh.demo.domain;

import org.springframework.data.annotation.Id;

/**
 * Created by Alavi on 10/06/2017.
 */
public class Room {
    @Id
    private String id;
    private String code;
    private  int capacity;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
