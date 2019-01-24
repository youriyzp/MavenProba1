package net.ukr.kiyashko.jdbc;

import net.ukr.kiyashko.jdbc.dto.Product;
import net.ukr.kiyashko.jdbc.dto.Purchase;
import net.ukr.kiyashko.jdbc.dto.PurchaseItem;
import net.ukr.kiyashko.jdbc.dto.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.System.*;

class JdbcStore {
    static  Connection conn;
    public static void main(String[] args) {
        try {

            // TODO Подключение к БД
            JdbcConnector app = new JdbcConnector();
             conn = app.connect();
            // TODO создать Пользователя - new User
            User bot = new User(1,"a@d.tr.com","7Street","Jon");
            // TODO создать несколько произвольных товаров - new Product
            List<String> tags= new ArrayList<>();
            tags.add("Igr");
            Product myach = new Product(1,"myach",120,tags);
            Product kukla = new Product(2,"kukla",150,new ArrayList<>());
            // TODO создать Заказ - new Purchase

            Purchase zakaz = new Purchase(new java.util.Date(),"Tolik","Zp",69059,bot.getId());

            // TODO создать несколько заказанных единиц  - new PurchaseItem
            PurchaseItem vesh1 = new PurchaseItem(1,2,300,1);
            PurchaseItem vesh2 = new PurchaseItem(2,3,320,2);
            // *TODO Получить все заказы и купленные товары пользователем.

            conn.close();
        } catch (Exception e) {
            err.println("Got an exception! ");
            err.println(e.getMessage());
        }

    }

    private User insertUser(User user) {
        // TODO создать запрос на вставку в БД используя значения из объекта.


        // TODO добавить обработку на получение ID, обновить его у объекта
        return null;
    }

    private Product insertProduct(Product product) {
        // TODO создать запрос на вставку в БД используя значения из объекта.
        // TODO добавить обработку на получение ID, обновить его у объекта
        return null;
    }

    private Purchase insertPurchase(Purchase purchase) {
        // TODO создать запрос на вставку в БД используя значения из объекта.
        // TODO добавить обработку на получение ID, обновить его у объекта
        return null;
    }

    private PurchaseItem insertPurchaseItem(PurchaseItem purchaseItem) {
        // TODO создать запрос на вставку в БД используя значения из объекта.
        // TODO добавить обработку на получение ID, обновить его у объекта
        return null;
    }
}