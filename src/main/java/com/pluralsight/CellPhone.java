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
    public CellPhone(int newSerialNumber, String newModel, String newCarrier, String newPhoneNumber, String newPhoneOwner) {
        serialNumber = newSerialNumber;
        model = newModel;
        phoneCarrier = newCarrier;
        phoneNumber = newPhoneNumber;
        phoneOwner = newPhoneOwner;


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

    public void dial(String phoneNumber) {
        System.out.println(phoneOwner + "'s phone is calling " + phoneNumber);
    }

    public void dial(CellPhone phone) {
        dial(phone.getPhoneNumber());
    }
}

