package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.stream.Collectors;

class AddressBookTest {
    AddressBookOperations operations = new AddressBookOperations();

    @Test
    void givenContact_WhenAddedToList_ShouldHaveThatContact() {
        operations.addContact("shubham", "verma", "madhavganj", "gwalior", "MP" , "474001", "9907071033", "shubham.verma@gmail.com" );
        List checkList = operations.contactList.stream().filter(contact -> contact.getFirstName().equalsIgnoreCase("shubham")).collect(Collectors.toList());
        Contacts result = (Contacts) checkList.get(0);
        String firstName = result.getFirstName();
        Assertions.assertEquals("shubham",firstName);
    }
}