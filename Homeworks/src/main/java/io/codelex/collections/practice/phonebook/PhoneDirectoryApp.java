package io.codelex.collections.practice.phonebook;

public class PhoneDirectoryApp {
    public static void main(String[] args) {
        PhoneEntry phoneEntry1 = new PhoneEntry("Alice", "123-456-7890");
        PhoneEntry phoneEntry2 = new PhoneEntry("Bob", "987-654-3210");
        PhoneEntry phoneEntry3 = new PhoneEntry("Charlie", "555-555-5555");

        PhoneDirectory firstPhoneDirectory = new PhoneDirectory();

        firstPhoneDirectory.putNumber(phoneEntry1.getName(), phoneEntry1.getNumber());
        firstPhoneDirectory.putNumber(phoneEntry2.getName(), phoneEntry2.getNumber());
        firstPhoneDirectory.putNumber(phoneEntry3.getName(), phoneEntry3.getNumber());

        System.out.println("Alice's number: " + firstPhoneDirectory.getNumber("Alice"));
        System.out.println("Bob's number: " + firstPhoneDirectory.getNumber("Bob"));
        System.out.println("Charlie's number: " + firstPhoneDirectory.getNumber("Charlie"));

        System.out.println("David's number: " + firstPhoneDirectory.getNumber("David"));

        firstPhoneDirectory.putNumber("Alice", "111-111-1111");
        System.out.println("Alice's number (updated): " + firstPhoneDirectory.getNumber("Alice"));
    }
}
