package com.pluralsight;

public class CellPhone {
    // Instance variables (data members)
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    // Parameterless constructor (sets default values)
    public CellPhone() {
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";
    }

    // Getters
    public int getSerialNumber() {
        return serialNumber;
    }

    public String getModel() {
        return model;
    }

    public String getCarrier() {
        return carrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    // Setters
    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    // New dial() method
    public void dial(String phoneToCall) {
        System.out.println(owner + " 's phone is calling" + phoneToCall);
    }

}
