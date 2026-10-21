package com.pluralsight;
import java.util.Scanner;


public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        CellPhone cellPhone1 = new CellPhone();


        System.out.print("What is the serial number? ");
        int serialNumber = Integer.parseInt(read.nextLine());
        cellPhone1.setSerialNumber(serialNumber);

        System.out.print("What model is the phone? ");
        String phoneModel = read.nextLine();
        cellPhone1.setModel(phoneModel);

        System.out.print("What is the phone carrier? ");
        String phoneCarrier = read.nextLine();
        cellPhone1.setPhoneCarrier(phoneCarrier);

        System.out.print("What is the phone number? ");
        String phoneNumber = read.nextLine();
        cellPhone1.setPhoneNumber(phoneNumber);

        System.out.print("Who is the phone owner? ");
        String phoneOwner = read.nextLine();
        cellPhone1.setPhoneOwner(phoneOwner);

        System.out.println("----------------------");
        System.out.println("CELL PHONE INFORMATION");
        System.out.println("Serial Number: " + cellPhone1.getSerialNumber());
        System.out.println("Model: " + cellPhone1.getModel());
        System.out.println("Phone carrier: " + cellPhone1.getPhoneCarrier());
        System.out.println("Phone number: " + cellPhone1.getPhoneNumber());
        System.out.println("Phone owner is " + cellPhone1.getPhoneOwner());


        read.close();


    }
}