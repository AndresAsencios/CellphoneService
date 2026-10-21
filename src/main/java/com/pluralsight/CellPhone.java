package com.pluralsight;

public class CellPhone {

    private int serialNumber;
    private String model;
    private String phoneCarrier;
    private String phoneNumber;
    private String phoneOwner;


    public CellPhone() {
        serialNumber = 0;
        model = "";
        phoneCarrier = "";
        phoneNumber = "";
        phoneOwner = "";
    }

    public void setModel(String newModel) {
        model = newModel;
    }

    public String getModel() {
        return model;
    }
    public void setPhoneCarrier(String newPhoneCarrier) {
        phoneCarrier = newPhoneCarrier;
    }

    public String getPhoneCarrier() {
        return phoneCarrier;
    }
    public void setPhoneNumber(String newPhoneNumber) {
        phoneNumber = newPhoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneOwner(String newPhoneOwner) {
        phoneOwner = newPhoneOwner;
    }

    public String getPhoneOwner() {
        return phoneOwner;
    }
    public void setSerialNumber(int newSerialNumber) {
        serialNumber = newSerialNumber;
    }
    public int getSerialNumber() {
        return serialNumber;
    }

//    void displayInfo() {
//        System.out.println("Serial Number: " + serialNumber);
//        System.out.println("Model: " + model);
//        System.out.println("Phone Carrier: " + phoneCarrier);
//        System.out.println("Phone Number: " + phoneNumber);
//        System.out.println("Phone Owner: " + phoneOwner);
//        System.out.println("----------------------");
    }
//}

