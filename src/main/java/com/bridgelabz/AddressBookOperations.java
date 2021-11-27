package com.bridgelabz;

import java.util.ArrayList;

public class AddressBookOperations {
    ArrayList<Contacts> contactList = new ArrayList<>();

    public void addContact (String firstName, String lastName, String address, String city, String state, String zip, String phoneNumber, String email) {
        contactList.add(new Contacts(firstName, lastName, address, city, state, zip, phoneNumber, email));
    }
}
