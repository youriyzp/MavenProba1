package net.ukr.kiyashko.Externalizable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializeDemo {
    public static void main(String[] args) {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.dat"))) {
            Employee p = (Employee) ois.readObject(); // приведение к типу, т к по умолчанию Object
            System.out.printf("name: %s \t Adress: %s SSN: %d Number : %d", p.getName(), p.getAddress(),p.getSSN(),p.getNumber());
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
    }
}


