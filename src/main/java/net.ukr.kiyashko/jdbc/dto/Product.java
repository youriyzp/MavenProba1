package net.ukr.kiyashko.jdbc.dto;

import java.util.Date;
import java.util.List;

public class Product {
    int id;
    String title;
    int price;
    Date createAt;
    List<String> tags;

    public Product(int id, String title, int price, List<String> tags) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.createAt=new Date();
        this.tags= tags;




    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}
