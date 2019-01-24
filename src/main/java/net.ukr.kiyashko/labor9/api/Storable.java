package net.ukr.kiyashko.labor9.api;

import net.ukr.kiyashko.labor9.base.Product;

/**
 * Basic interface for store some products.
 */
public interface Storable {

    /**
     * Add product to main list.
     * @param product
     */
    void addNewProduct(Product product);

    /**
     * Get full products list.
     * @return Return full products list.
     */
    Product[] getAllProducts();
}
