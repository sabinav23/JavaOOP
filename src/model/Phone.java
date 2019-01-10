package model;

import exceptions.PhoneException;
import exceptions.PhoneExceptionErrorCodes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Phone {

    private String color;
    private String material;
    private String imei;
    private Use use;
    private List<Contact> contacts;
    private List<String> history;
    private Map<String, List<Message>> messagesForPhoneNumber;


    public Phone() {
        this.contacts = new ArrayList<>();
        this.messagesForPhoneNumber = new HashMap<>();
        this.history = new ArrayList<>();
    }

    public Phone(Use use) {
        this();
        this.use = use;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void addContact(int ID, String phoneNumber, String firstName, String lastName) {
        Contact contact = new Contact(ID, phoneNumber, firstName, lastName);
        this.contacts.add(contact);
    }

    public void listContacts() {
        for (Contact contact : this.contacts) {
            System.out.println(contact);
        }
    }

    public void listMessages(String phoneNumber) {
        for (Message message : this.messagesForPhoneNumber.get(phoneNumber)) {
            System.out.println(message);
        }
    }


    public void sendMessage (String phoneNumber, String description) throws PhoneException {
        if(description.length() > 500){
            throw new PhoneException(PhoneExceptionErrorCodes.TOO_MANY_CHARS);
        }
        Message message = new Message(description);
        List<Message> messages = this.messagesForPhoneNumber.get(phoneNumber);
        if(messages == null){
            messages = new ArrayList<>();
        }
        messages.add(message);

        this.messagesForPhoneNumber.put(phoneNumber, messages);
        this.decreaseBatteryLife(10);
        System.out.println(this.getBatteryLife());
    }

    public void call(String phoneNumber) throws PhoneException {
        int battery = this.getBatteryLife();
        if(battery <= 0){
            throw new PhoneException(PhoneExceptionErrorCodes.PHONE_DEAD);
        }
        this.history.add(phoneNumber);
        this.decreaseBatteryLife(20);
        System.out.println(this.getBatteryLife());
    }

    public void viewHistory(){
        System.out.println(this.history);
    }

    public abstract void decreaseBatteryLife(int hours);
    public abstract int getBatteryLife();

}