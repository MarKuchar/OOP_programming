package classes;

import javax.crypto.Cipher;

public class Client {
    public static void main(String[] args) {
        Contact lucas = new Contact("Lucas", "721-313-4122");
        Contact tomona = new Contact("Tomona","132-123-6235", "tomona.sako@gmail.com");

        ContactManager phoneBook = new ContactManager();
        phoneBook.addContact(lucas);
        phoneBook.addContact(tomona);

        phoneBook.printAllContacts();

        phoneBook.searchContact("Martin");
        phoneBook.searchContact("Lucas");
    }
}
