package net.ukr.kiyashko.lab2_12;

import java.util.Comparator;

 class MyNameComparator implements Comparator<MyPhoneBook.PhoneNumber> {
    /* private String name;
     MyPhoneBook.PhoneNumber(String name){this.name=name;
     }
     String setName(){return name;
     }*/
    public int  compare(MyPhoneBook.PhoneNumber o1, MyPhoneBook.PhoneNumber o2){
                return o1.setName().compareTo(o2.name);
    }


     // public abstract int compare(MyPhoneBook.PhoneNumber o1, MyPhoneBook.PhoneNumber o2);
}
