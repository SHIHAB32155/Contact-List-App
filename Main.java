package com.programmer;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ContactData contactDatas = new ContactData("Mohon", "456775439");
        //System.out.println(contactDatas);

        ContactData contactDatas1 = new ContactData("shihab", "456775439", "shihab@gamil.com");

        ContactList list = new ContactList();
        list.createContact(contactDatas);
        list.createContact(contactDatas1);
        System.out.println(list);

       ContactData search = list.searchContact("mohon");
       if (search != null){
           System.out.println(search);
       } else {
           System.out.println("Contact not found");
       }

        System.out.println(list.getTotalContact());
    }
}
