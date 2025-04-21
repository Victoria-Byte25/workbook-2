package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        // Create a phone using overloaded constructor
        CellPhone phone1 = new CellPhone("Apple", "iPhone 14", "555-1234", "Blue", 128);

        // Create a second phone using default constructor and setters
        CellPhone phone2 = new CellPhone();
        phone2.setBrand("Samsung");
        phone2.setModel("Galaxy S23");
        phone2.setPhoneNumber("555-5678");
        phone2.setColor("Black");
        phone2.setStorage(256);

        // Display both phones
        System.out.println("Phone 1 info:");
        phone1.display();
        System.out.println("\nPhone 2 info:");
        phone2.display();

        // Dial phone2 from phone1 (String version)
        System.out.println("\nDial using phone number:");
        phone1.dial(phone2.getPhoneNumber());

        // Dial phone2 from phone1 (Object version)
        System.out.println("\nDial using CellPhone object:");
        phone1.dial(phone2);
    }
}



