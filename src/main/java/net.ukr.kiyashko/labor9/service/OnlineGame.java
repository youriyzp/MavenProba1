package net.ukr.kiyashko.labor9.service;

import net.ukr.kiyashko.labor9.api.Purchaser;
import net.ukr.kiyashko.labor9.base.Product;

// TODO  implements Purchase
public class OnlineGame implements Purchaser {
    String product;
    Double money = 2000.00;
    Product[] products;

    @Override
    public Product[] addToBucket(Product... product) {
        return products = product;
    }

    @Override
    public boolean buy(Product... product) {
        Double summ = 0.0;
        for (Product p : product) {
            summ += p.getPrice();
        }
        if (summ <= money) {
            System.out.println("Summa pokupki: "+ summ);
        } else System.out.println("Malo deneg");
            return false;
    }


}
