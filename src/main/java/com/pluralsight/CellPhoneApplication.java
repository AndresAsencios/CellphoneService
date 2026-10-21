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

        System.out.print("----------------------");
        System.out.print("CELL PHONE INFORMATION");
        System.out.print("----------------------");
        System.out.print("\nSerial Number: " + cellPhone1.getSerialNumber());
        System.out.print("\nModel: " + cellPhone1.getModel());
        System.out.print("\nPhone carrier: " + cellPhone1.getPhoneCarrier());
        System.out.print("\nPhone number: " + cellPhone1.getPhoneNumber());
        System.out.print("\nPhone owner is " + cellPhone1.getPhoneOwner());


        read.close();


    }
}