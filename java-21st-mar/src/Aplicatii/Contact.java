package Aplicatii;

import java.util.ArrayList;
import java.util.List;

public class Contact {
    private String name;
    private String phoneNumber;

    ArrayList<Contact> contacts = new ArrayList<>();

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public Contact() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /** methods */


    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void remove(String name){
        for (int i = 0; i<contacts.size(); i++){
            if (contacts.get(i).getName().equals(name)){
                contacts.remove(i);
                break;
            }
        }
    }

    public Contact search(){
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                return contact;
            }
        }
        return null;
    }
}
