package com.doomsDay.doomsDay.entity;

public class Robot {

    private String model;
    private String serialNumber;
    private String manufactureDate;
    private String category;



    // constructors

    public Robot() {
    }

    public Robot(String model, String serialNumber, String manufactureDate, String category) {
        this.model = model;
        this.serialNumber = serialNumber;
        this.manufactureDate = manufactureDate;
        this.category = category;
    }



    //getters and setters


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(String manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
