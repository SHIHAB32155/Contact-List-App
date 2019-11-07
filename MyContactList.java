package com.programmer;

import java.util.ArrayList;
import java.util.Scanner;

public class MyContactList {

    public static void main(String[] args) {
        ContactList contactList = new ContactList();
        Scanner scanner = new Scanner(System.in);
        int numberOfMenu = 0;



        do {
            menuView();
            numberOfMenu = scanner.nextInt();

            switch (numberOfMenu){
                case 1:
                    ContactData contact = createNewContact(scanner);
                    contactList.createContact(contact);
                    System.out.println("successfully created....");
                    System.out.println();
                    break;

                case 2:
                    searchList(contactList, scanner);
                    break;

                case 3:
                    showAllContacts(contactList.getContacts());
                    break;

                case 4:
                    deleteContact(contactList, scanner);
                    break;

                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please try again");
            }

        } while (numberOfMenu != 5);

    }
    private static void menuView(){
        System.out.println(String.format("%5s%s%s","1."," ", "Create new Contact:"));
        System.out.println(String.format("%5s%s%s","2."," ", "Search contact:"));
        System.out.println(String.format("%5s%s%s","3."," ", "View all contact:"));
        System.out.println(String.format("%5s%s%S","4."," ", "Delete Contact:"));
        System.out.println(String.format("%5s%s%s","5."," ", "Exit:"));
        System.out.println("............................................");
        System.out.println(String.format("Please enter your choice:"));
    }

    // For create new contact in the list
    private static ContactData createNewContact(Scanner scanner){
        scanner.nextLine();
        String name, phone, email, address;
        ContactData contact;


        System.out.println("Please Fill up the form:");

        System.out.print("Enter your name: * ");
        name = scanner.nextLine();


        System.out.print("Enter your Phone Number: * ");
        phone = scanner.nextLine();


        System.out.print("Enter your email if available ( if not type N): ");
        email = scanner.nextLine();

        System.out.println("Enter your Address is available (if not type A): ");
        address = scanner.nextLine();

        if (email.equalsIgnoreCase("N")){
            contact = new ContactData(name, phone);

        } else if (address.equalsIgnoreCase("A")){
            contact = new ContactData(name, phone, email);
        } else {
            contact = new ContactData(name, phone, email, address);
        }

        return contact;

    }
    
    // SearchList for search the contact from the list
    private static void searchList(ContactList contactList, Scanner scanner){
        scanner.nextLine();
        System.out.println("Enter name to search: ");
        String name = scanner.nextLine();

        ContactData contact = contactList.searchContact(name);

        if (contact != null){
            String email = contact.getEmailAddress();
            String address = contact.getAddress();
            System.out.println(String.format("%5s%10s%15s", contact.getName(),
                    contact.getPhoneNumber(),email == null ? "N/A" : email, address == null ? "N/A" : address));
        } else{
            System.out.println("Contact not found.");
        }
    }
    
    //showAllContacts Method to see all the contacts
    private static void showAllContacts(ArrayList<ContactData> contacts){
        System.out.println("All contacts.......");

        System.out.println("................................");

        int i = 0;
        for (ContactData cd: contacts) {
            String email = cd.getEmailAddress();
            String address = cd.getAddress();
            System.out.println(String.format("%5d-%20s-%15s-%20s-%15s", i++, cd.getName(),
                    cd.getPhoneNumber(),email == null ? "N/A" : email, address == null ? "N/A" : address)); // Using ternary operator
        }


        System.out.println("................................");
    }
    
    //Delete method for deleting less important contact
    private static void deleteContact(ContactList contactList, Scanner scanner){
        // For choosing delete item showAllContacts method is used inside the deleteContact method
        showAllContacts(contactList.getContacts());
        System.out.println("Enter index number: ");
        int index = scanner.nextInt();

        contactList.removeContact(index);
        System.out.println("Successfully removed......");
    }


}
