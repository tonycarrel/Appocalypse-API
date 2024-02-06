package com.doomsDay.doomsDay.entity;

import org.springframework.data.geo.Point;

public class infectedSurvivor {

    private Integer i_id;
    private String name;
    private Character gender;
    private Point i_lastLocation;

    public infectedSurvivor() {
    }

    public infectedSurvivor(Integer i_id, String name, Character gender, Point i_lastLocation) {
        this.i_id = i_id;
        this.name = name;
        this.gender = gender;
        this.i_lastLocation = i_lastLocation;
    }

    public Integer getI_id() {
        return i_id;
    }

    public void setI_id(Integer i_id) {
        this.i_id = i_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public Point getI_lastLocation() {
        return i_lastLocation;
    }

    public void setI_lastLocation(Point i_lastLocation) {
        this.i_lastLocation = i_lastLocation;
    }
}
