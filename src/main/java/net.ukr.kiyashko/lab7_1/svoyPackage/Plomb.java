package net.ukr.kiyashko.lab7_1.svoyPackage;


public class Plomb {
    protected String serial;
    protected int number;

    public void use(){System.out.println("Use");
    }

    protected String getNumber (){ return serial  + number;
    }

}
