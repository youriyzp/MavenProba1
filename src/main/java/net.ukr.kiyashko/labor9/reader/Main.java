package net.ukr.kiyashko.labor9.reader;

public class Main {

    public static void main(String[] args) {
        String data = "fafaffa";

        Book book1 = new Book();
        Ebook ebook1 = new Ebook();
        Journal journal1 = new Journal();
        Site site1 = new Site();
        book1.read(data);
        ebook1.read(data);
        journal1.read(data);
        site1.read(data);

    }
}