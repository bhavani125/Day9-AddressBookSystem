package com.book;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    //here iam using ArrayList to store
    public static ArrayList<Contacts> contactsArrayList = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);

    //main method
    public static void main(String[] args) {
        boolean options = true;
        while (options) {
            System.out.println("Enter \n 1)To Add contacts \n 2) To edit contacts\n 3) To Exit");
            System.out.println("Enter the option : ");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    AddressBook.addContacts();
                    break;
                case 2:
                    AddressBook.editContacts();
                    break;
                default:
                    System.out.println("Invalid Option");
            }

        }
    }

    //creating a method for adding contacts
    static void addContacts() {
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
            System.out.println("Enter the zip");
            person.setZip(sc.nextLong());
            System.out.println("Enter the phoneNumber");
            person.setPhoneNumber(sc.nextLong());

            //using toString
            System.out.println(person.toString());
            contactsArrayList.add(person);

            System.out.println("Enter 1 add to another contact or Enter 0 to exit");
            int number = sc.nextInt();
            if (number == 0) {
                choice = 1;
            }
        }
    }

    //creating method for editing contacts
    static void editContacts() {

        System.out.println("Enter firstname of the user you want to the edit:");
        String firstName = sc.next();
        for (Contacts c : contactsArrayList) {
            if (c.getFirstName().equals(firstName)) {

                System.out.println("c");
                System.out.println("Enter the  field which u want to edit:");

                System.out.println(" Address");
                System.out.println(" City ");
                System.out.println(" State");
                System.out.println(" Email");
                System.out.println(" Phone Number");
                System.out.println(" ZipCode");
                System.out.println("Exit");
                String field = sc.next();

                if (field.equals("firstName")) {
                    c.setFirstName(sc.next());
                } else if (field.equals("lastName")) {
                    c.setLastName(sc.next());
                } else if (field.equals("Address")) {
                    c.setAddress(sc.next());
                } else if (field.equals("City")) {
                    c.setCity(sc.next());
                } else if (field.equals("State")) {
                    c.setState(sc.next());
                } else if (field.equals("Email")) {
                    c.setEmailId(sc.next());
                } else if (field.equals("Zip")) {
                    c.setZip(sc.nextLong());
                } else if (field.equals("phoneNumber")) {
                    c.setPhoneNumber(sc.nextLong());
                }
            }

        }
            System.out.println(contactsArrayList.toString());

        }
    }
