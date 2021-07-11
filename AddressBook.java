package com.book;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    //here iam using ArrayList to store
    public static ArrayList<Contacts> contactsArrayList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Welcome to AddressBook Program");

        Scanner sc = new Scanner(System.in);
        // creating object
        Contacts person = new Contacts();

        //local variable
        int choice = 0;
        while (choice == 0) {
            System.out.println("Enter the firstName");
            person.setFirstName(sc.next());
            System.out.println("Enter the lastName");
            person.setLastName(sc.next());
            System.out.println("Enter the address");
            person.setAddress(sc.next());
            System.out.println("Enter the city");
            person.setCity(sc.next());
            System.out.println("Enter the state");
            person.setState(sc.next());
            System.out.println("Enter the EmailId");
            person.setEmailId(sc.next());
            System.out.println("Enter the phoneNumber");
            person.setPhoneNumber(sc.nextLong());
            System.out.println("Enter the zip");
            person.setZip(sc.nextLong());

            //using console
            System.out.println(person.toString());
            contactsArrayList.add(person);
            System.out.println(contactsArrayList);
            System.out.println("Enter 1 add to another contact or Enter 0 to exit");
            int number = sc.nextInt();
            if (number == 0) {
                choice = 1;
            }
        }
    }
}


