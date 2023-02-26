public class Main {
    static Contact[] contacts = new Contact[3];

    public static void main(String[] args) {
        Phone phone0 = new Phone("Samsung", "S-23", 8899, new Contact[]
                {new Contact("das", 5555)});
        Phone phon1 = new Phone("Lg", "G-40", 8099, new Contact[]
                {new Contact("Tilek", 4455)});
        Phone phon2 = new Phone("Xiaomi", "Not12", 7799, new Contact[]
                {new Contact("Aibek", 4255)});
        Phone[] phones = {phone0, phon1, phon2};
        for (Phone phone12 : phones) {
            System.out.println("Ура");
        }
       // phone0.turnOn();
      //  phone0.call();
        phone0.call();
        phone0.getAllContact();
    }
}