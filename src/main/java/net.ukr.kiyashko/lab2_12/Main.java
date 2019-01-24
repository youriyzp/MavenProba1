package net.ukr.kiyashko.lab2_12;

public class Main {
    public static void main(String argv[]) {
MyPhoneBook myPhoneBook= new MyPhoneBook();
myPhoneBook.addPhoneNumber("vasyl","066");
myPhoneBook.addPhoneNumber("igor","067");
myPhoneBook.addPhoneNumber("youla","050");
myPhoneBook.addPhoneNumber("taras","099");
myPhoneBook.addPhoneNumber("nastya","044");
myPhoneBook.printPhoneBook();
//myPhoneBook.sortByName();
myPhoneBook.sortByNumber();

    }
}
