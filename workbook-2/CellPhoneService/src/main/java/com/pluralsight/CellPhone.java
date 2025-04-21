package com.pluralsight;

public class CellPhone {
    private String brand;
    private String model;
    private String phoneNumber;
    private String color;
    private int storage;

    // Default constructor
    public CellPhone() {}

    // Overloaded constructor with 5 parameters
    public CellPhone(String brand, String model, String phoneNumber, String color, int storage) {
        this.brand = brand;
        this.model = model;
        this.phoneNumber = phoneNumber;
        this.color = color;
        this.storage = storage;
    }

    // Setters
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    // Getters (for use in dial(CellPhone))
    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Display method
    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Color: " + color);
        System.out.println("Storage: " + storage + "GB");
    }

    // Original dial method
    public void dial(String phoneNumber) {
        System.out.println("Dialing " + phoneNumber + "...");
    }

    // Overloaded dial method
    public void dial(CellPhone phone) {
        System.out.println("Dialing " + phone.getPhoneNumber() + " from " + this.phoneNumber + "...");
    }
}


