package net.ukr.kiyashko.jdbc.dto;

import java.util.Date;
import java.util.List;

public class Purchase {
int id;
Date created_at;
String name;
String adress;
int zipcode;
int user_id;

    public Purchase( Date created_at, String name, String adress, int zipcode, int user_id) {

        this.created_at = created_at;
        this.name = name;
        this.adress = adress;
        this.zipcode = zipcode;
        this.user_id = user_id;
    }

    public int getId() {
        return id;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public int getZipcode() {
        return zipcode;
    }

    public int getUser_id() {
        return user_id;
    }



    public void setId(int id) {
        this.id = id;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }


// TODO добавить все поля из таблицы БД
}
