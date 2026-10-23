package com.pluralsight;
import java.util.Scanner;


public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        CellPhone cellPhone1 = new CellPhone();
        CellPhone cellPhone2 = new CellPhone();
        CellPhone cellPhone3 = new CellPhone(
                98765,
                "iPhone 16 Pro",
                "AT&T",
                "555-987-6543",
                "Alex"
        );


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

        cellPhone2.setSerialNumber(67890);
        cellPhone2.setModel("Samsung Galaxy S25");
        cellPhone2.setPhoneCarrier("Verizon");
        cellPhone2.setPhoneNumber("555-123-4567");
        cellPhone2.setPhoneOwner("Sandra");

        display(cellPhone1);
        display(cellPhone2);
        display(cellPhone3);

        cellPhone1.dial(cellPhone2);
        cellPhone2.dial(cellPhone1);
        cellPhone1.dial(cellPhone3);

        read.close();
    }

    public static void display(CellPhone phone) {
        System.out.print("Serial Number: " + phone.getSerialNumber());
        System.out.print("\nModel: " + phone.getModel());
        System.out.print("\nPhone Carrier: " + phone.getPhoneCarrier());
        System.out.print("\nPhone Number: " + phone.getPhoneNumber());
        System.out.print("\nPhone Owner: " + phone.getPhoneOwner());
        System.out.print("\n----------------------\n");
    }
}