package net.ukr.kiyashko.lab7_1.interfaces.communication;

public class HomePhone implements Caller {

    @Override
    public void call(String contact) {
        System.out.println("Press buttons");
        System.out.println("Call my mom!");
    }

}
