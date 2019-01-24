package net.ukr.kiyashko.lab5;

public class Lamp {
    private double potreblenie;
    private double spectr;
    private boolean sostoyanie;
    Lamp (double potreblenie,double spectr,boolean sostoyanie){
        this.potreblenie=potreblenie;
        this.spectr=spectr;
        this.sostoyanie=sostoyanie;
    }

    public double getPotreblenie() {
        return potreblenie;
    }
}
