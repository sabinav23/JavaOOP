import exceptions.PhoneException;
import model.*;

public class Main {

    public static void main(String[] args) {

        Phone phone1= new SamsungGalaxyS9(Use.Photos, 35);
        Phone phone2= new SamsungNote9(Use.Personal,50);


        Contact contact1 = new Contact(1, "12345", "Eu", "TotEu");

        phone1.setColor("red");
        phone1.setMaterial("glass");

        phone1.addContact(2, "123456789", "NotMe", "JustKidding");

        phone1.listContacts();


        try {
            phone1.sendMessage("123456789", "Te super plac mury cool");
            phone1.sendMessage("123456789", "Te plac cateodata");

        } catch (PhoneException e) {
            e.printStackTrace();
        }






    }
}
