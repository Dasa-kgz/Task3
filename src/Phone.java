import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Phone implements PhoneInterface {
    Scanner sc = new Scanner(System.in);
    private String brand;
    private String name;
    private int password;
    private Contact[]cont;

    public Contact[] getCont() {
        return cont;
    }

    public void setCont(Contact[] cont) {
        this.cont = cont;
    }

    public Phone(String br, String nm, int pass,Contact[]cont) {
        this.brand = br;
        this.name = nm;
        this.password = pass;
        this.cont = cont;
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


    @Override
    public String toString() {
        return "Phone{" +
                "sc=" + sc +
                ", brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", password=" + password +
         ", contacts=" + Arrays.toString(cont) +
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
       int phoneNumber=sc.nextInt();
        for (Contact contact:cont) {
            if (phoneNumber==cont.length) {
                System.out.println("Numbers "+contact.getFullName());
            }
        }

    }

    @Override
    public Contact call(String fullName) {
        System.out.println("Введите имя контакта");
        String name = sc.nextLine();
        for (int i = 0; i < cont.length; i++) {
            if (name == cont[i].getFullName()) {
                System.out.println("Вы звоните " + cont[i].getFullName() + " " + cont[i].getPhoneNumber());
            } else
                return null;
    }
        return null;
    }

    @Override
    public Contact getAllContact() {
        System.out.println(Arrays.toString(cont));
        return null;
    }

}