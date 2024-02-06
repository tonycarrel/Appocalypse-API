package com.doomsDay.doomsDay.entity;

import org.springframework.data.geo.Point;

public class unInfectedSurvivor {


    private Integer u_id;
    private String u_name;
    private Character u_gender;
    private Point u_lastLocation;

    public unInfectedSurvivor() {
    }

    public unInfectedSurvivor(Integer u_id, String u_name, Character u_gender, Point u_lastLocation) {
        this.u_id = u_id;
        this.u_name = u_name;
        this.u_gender = u_gender;
        this.u_lastLocation = u_lastLocation;
    }

    public Integer getU_id() {
        return u_id;
    }

    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public Character getU_gender() {
        return u_gender;
    }

    public void setU_gender(Character u_gender) {
        this.u_gender = u_gender;
    }

    public Point getU_lastLocation() {
        return u_lastLocation;
    }

    public void setU_lastLocation(Point u_lastLocation) {
        this.u_lastLocation = u_lastLocation;
    }
}
