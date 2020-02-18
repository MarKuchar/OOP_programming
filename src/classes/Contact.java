package classes;

public class Contact {
    // field
    String name;
    String phone;
    String email;

    // constructor
    Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    Contact(String name, String phone) {  // This constructor is just optional, to make it simpler
        this.name = name;
        this.phone = phone;
    }
}

