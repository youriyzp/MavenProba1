package net.ukr.kiyashko.lab2_12;


import java.util.Arrays;
import java.util.Comparator;

public class MyPhoneBook {
    PhoneNumber[] phoneNumbers = new PhoneNumber[10];

    public void addPhoneNumber(String name, String phone) {
        for (int i = 0; i < phoneNumbers.length; i++) {
            if (phoneNumbers[i] == null) {
                phoneNumbers[i] = new PhoneNumber(name, phone);
                return;
            }

        }

    }
 /*   public void sortByName() {
       /* Comparator<MyPhoneBook> MyNameComparator = new Comparator<MyPhoneBook>() {

            @Override
            public int compare(MyPhoneBook o1, MyPhoneBook o2) {
                return 0;
            }
        }
    }

        /*for (int i = 0;i < phoneNumbers.length; i++){
            if (phoneNumbers[i]==null){
                phoneNumbers[i]=new PhoneNumber(name,phone);
                return;*/
      /*  for (int i = 0; i < phoneNumbers.length; i++) {
            if (phoneNumbers[i]==null){
                phoneNumbers[i]=new PhoneNumber(addPhoneNumber();
                return;
            }
          Arrays.sort(phoneNumbers, new MyNameComparator <PhoneNumber>() {

                @Override
                public int compare(PhoneNumber o1,
                                   PhoneNumber o2){
                    if (o1.name==null||o2.name==null){
                       // return -1;
                        //System.out.println("null");
                    }
                    return o1.name.compareTo(o2.name);
                }

            });
            System.out.println(Arrays.asList(phoneNumbers));
        }


     /*   Arrays.sort(phoneNumbers, new MyNameComparator <PhoneNumber>() {

            @Override
            public int compare(PhoneNumber o1,
            PhoneNumber o2){
                if (o1.name== null||o1.phone==null ){
                    return -1;
                }
                else
                                return o1.name.compareTo(o2.name);
            }

        });
       System.out.println(Arrays.asList(phoneNumbers));


            }
    public void  sortByNumber(){
      /*  Arrays.sort(phoneNumbers, new MyNameComparator <PhoneNumber>() {
            @Override
            public int compare(PhoneNumber o1,
                               PhoneNumber o2){
                return o1.name.compareTo(o2.name);
            }

        });
        System.out.println(Arrays.asList(phoneNumbers));
*/

    public void printPhoneBook() {


        for (int i = 0; i < phoneNumbers.length; i++) {
            if (phoneNumbers[i] == null) {
                continue;
            }
            System.out.println(phoneNumbers[i]);
        }
    }

    public void sortByNumber() {

    }

    class PhoneNumber implements Comparator<PhoneNumber> {
        String name;
        String phone;

        public int compare(PhoneNumber o1, PhoneNumber o2) {
            return o1.setName().compareTo(o2.name);
        }


        public PhoneNumber(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }

        public String setName(String name) {
            return this.name;
        }

        public String setPhone(String phone) {
            return this.phone;
        }

        @Override
        public String toString() {
            return "Телефонная книга: " +
                    "Имя='" + name + '\'' +
                    ", телефон='" + phone + '\'';
        }

        public Comparable<String> setName() {
            return null;
        }
    }


}
