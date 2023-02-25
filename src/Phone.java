import java.util.Arrays;
import java.util.Scanner;

public class Phone implements PhoneInterface {
    Scanner sc = new Scanner(System.in);
    private String brand;
    private String name;
    private int password;
    private Contact[] contacts;


    public Phone(String brand, String name, int password, Contact[]contacts) {
        this.brand = brand;
        this.name = name;
        this.password = password;
        this.contacts=contacts;
    }

    public Phone(String samsung, String name, int password, int i) {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public Contact[] getContacts() {
        return contacts;
    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "sc=" + sc +
                ", brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", password=" + password +
                ", contacts=" + Arrays.toString(contacts) +
                '}';
    }

    @Override
    public void turnOn() {
        System.out.println("Телефон жанып жатат");
        System.out.println("Введите пароль");
        int pass = sc.nextInt();
        if (pass == password) {
            System.out.println("Телефон жанды");
        } else {
            System.out.println("Пароль туура эмес");
        }
    }

    @Override
    public void call() {
        System.out.println("Введите номер телефона");
        int coll = sc.nextInt();
        for (int i = 0; i < contacts.length; i++) {
            if (coll == contacts[i].getPhoneNumber()) {
                System.out.println(contacts[i].getFullName());
            } else {
                System.out.println("null");

            }
        }
    }

    @Override
    public Contact call(String fullName) {
        System.out.println("Введите имя контакта");
        String name = sc.nextLine();
        for (int i = 0; i < contacts.length; i++) {
            if (name == contacts[i].getFullName()) {
                System.out.println("Вы звоните " + contacts[i].getFullName() + " " + contacts[i].getPhoneNumber());
            } else
                return null;
    }
        return null;
    }

    @Override
    public Contact getAllContact() {
        return null;
    }

}