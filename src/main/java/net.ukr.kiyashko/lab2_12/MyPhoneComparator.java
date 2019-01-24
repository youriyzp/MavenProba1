package net.ukr.kiyashko.lab2_12;

import java.util.Comparator;

public class MyPhoneComparator {

    class MyNameComparator<P> implements Comparator<MyPhoneBook.PhoneNumber> {
        public int compare(MyPhoneBook.PhoneNumber a, MyPhoneBook.PhoneNumber b) {
            return a.phone.compareTo(b.phone);
        }

    }
}
