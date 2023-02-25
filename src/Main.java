public class Main {
    public static void main(String[] args) {
        Contact contact=new Contact("Das",555);
       Phone phone = new Phone("Samsung","S-23",8,555);
       phone.turnOn();
       phone.call();
       phone.getAllContact();
    }
}