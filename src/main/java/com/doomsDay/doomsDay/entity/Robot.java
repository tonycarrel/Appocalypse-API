package com.doomsDay.doomsDay.entity;

public class Robot {

    private String category;


    // constructors
    public Robot(String model, String serialNumber, String manufactureDate, String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    //getters and setters

}
