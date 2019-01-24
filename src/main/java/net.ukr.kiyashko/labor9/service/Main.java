package net.ukr.kiyashko.labor9.service;

import net.ukr.kiyashko.labor9.base.Product;

public class Main {
    public static void main(String[] args) {
        Product p =new Product("Mech",250.00);
        Product u =new Product( "tach",550.00);
        OnlineGame game1= new OnlineGame();
        game1.addToBucket(p,u);
        game1.buy(p,u);




    }
}
