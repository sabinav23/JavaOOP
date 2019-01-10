package model;

public class Contact {

    private int ID;
    private String phoneNumber;
    private String firstName;
    private String lastName;

    public Contact(int ID, String phoneNumber, String firstName, String lastName){
        this.ID = ID;
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

}
