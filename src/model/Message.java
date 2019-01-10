package model;

public class Message {

    private String description;

    public Message(String description){
        this.description = description;
    }

    @Override
    public String toString() {
        return "model.Message[" + description + ']';
    }
}
