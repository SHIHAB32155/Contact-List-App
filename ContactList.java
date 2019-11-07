package com.programmer;

import java.util.ArrayList;

public class ContactList {

  private ArrayList<ContactData> contacts;

  //Constructor  
  public ContactList() {
        this.contacts = new ArrayList<>();
    }

  // Methods  for process contact list
  public void createContact(ContactData contact){
        contacts.add(contact);
    }

    public int getTotalContact(){
        return contacts.size();
    }

    public void removeContact(int index){
        contacts.remove(index);
    }

   
  public ContactData searchContact(String name){
        for (ContactData data : contacts) {
            if (data.getName().equalsIgnoreCase(name)){
                return data;
            }
        }
        return null;
    }

    public ArrayList<ContactData> getContacts() {
        return contacts;
    }

    @Override
    public String toString() {
        return "ContactList{" +
                "contacts=" + contacts +
                '}';
    }
}
