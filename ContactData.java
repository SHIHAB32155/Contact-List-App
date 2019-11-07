package com.programmer;

public class ContactData {

    //Properties
    private String name;
    private String phoneNumber;
    private String emailAddress;
    private String address;

    // Constructors
    public ContactData(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = null;
        this.address = null;
    }

    public ContactData(String name, String phoneNumber, String emailAddress) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.address = null;
    }

    public ContactData(String name, String phoneNumber, String emailAddress, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.address = address;
    }

    // Using Getters for get access from another  method
    public String getName() {
        return name;
    }   

    public String getPhoneNumber() {
        return phoneNumber;
    }   

    public String getEmailAddress() {
        return emailAddress;
    }   

    public String getAddress() {
        return address;
    }
   
    @Override
    public String toString() {
        return "ContactData{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
