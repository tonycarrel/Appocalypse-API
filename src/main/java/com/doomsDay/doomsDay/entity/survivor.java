package com.doomsDay.doomsDay.entity;


import org.springframework.data.geo.Point;

import java.awt.*;
import java.security.PrivateKey;

public class survivor {

    private  Long survivor_id;
    private String name;
    private int age;

    private  Character gender;
    private Point lastLocation;
    private  boolean infectedStatus;
    private String inventory;


    public survivor() {
    }

    public survivor(Long survivor_id, String name, int age, Character gender, Point lastLocation, boolean infectedStatus, String inventory) {
        this.survivor_id = survivor_id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.lastLocation = lastLocation;
        this.infectedStatus = infectedStatus;
        this.inventory = inventory;
    }

    public Long getSurvivor_id() {
        return survivor_id;
    }

    public void setSurvivor_id(Long survivor_id) {
        this.survivor_id = survivor_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public Point getLastLocation() {
        return lastLocation;
    }

    public void setLastLocation(Point lastLocation) {
        this.lastLocation = lastLocation;
    }

    public boolean isInfectedStatus() {
        return infectedStatus;
    }

    public void setInfectedStatus(boolean infectedStatus) {
        this.infectedStatus = infectedStatus;
    }

    public String getInventory() {
        return inventory;
    }

    public void setInventory(String inventory) {
        this.inventory = inventory;
    }

    public void setLastLocation(java.awt.Point newLocation) {
    }
}
