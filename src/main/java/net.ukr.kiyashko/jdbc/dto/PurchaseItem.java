package net.ukr.kiyashko.jdbc.dto;

public class PurchaseItem {
    int id;
    int purchase_id;
    int product_id;
    int price;
    int quantity;

    public PurchaseItem( int purchase_id, int product_id, int price, int quantity) {

        this.purchase_id = purchase_id;
        this.product_id = product_id;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPurchase_id() {
        return purchase_id;
    }

    public void setPurchase_id(int purchase_id) {
        this.purchase_id = purchase_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    // TODO добавить все поля из таблицы БД
}
