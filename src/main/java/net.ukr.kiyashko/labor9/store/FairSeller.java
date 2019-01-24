package net.ukr.kiyashko.labor9.store;

import net.ukr.kiyashko.labor9.base.AbstractStore;
import net.ukr.kiyashko.labor9.base.Product;

public class FairSeller extends AbstractStore {

    public FairSeller(String storeName, Product[] products) {
        super(storeName, products);
    }

    @Override
    protected void registerNewProduct(Product newProduct) {

    }
}
