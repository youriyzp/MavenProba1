package net.ukr.kiyashko.lab2_11;

public class TestMain {
    public static void main(String argv[]) {
        MyTest myTest=new MyTest();

        try {
            myTest.test();

        } catch (MyException e) {
            e.getMyExeption();
        }
    }
}
