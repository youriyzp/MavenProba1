package net.ukr.kiyashko.lab7_1.svoyPackage;

import net.ukr.kiyashko.lab7_1.svoyPackage.HomutPlomb;

import java.util.Objects;

public class HomutPlomb extends Plomb {

    private String name;
    private int price;


    @Override
    public void use() {
        System.out.println("Use homut");
    }

    public HomutPlomb(String serial, int number, String name, int price) {
        super.serial = serial;
        super.number = number;
        this.name = name;
        this.price = price;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HomutPlomb homutPlomb = (HomutPlomb) o;
        return price == homutPlomb.price &&
                Objects.equals(name, homutPlomb.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    public String toString() {
        return name + " cost " + price;
    }




}

