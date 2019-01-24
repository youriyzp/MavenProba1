package net.ukr.kiyashko.Reflrction;

public class MyClass {
    private  Integer a;
    protected Integer b;
    public Integer c;
    static private Integer d;

    public Integer getA() {
        return a;
    }

    public Integer getB() {
        return b;
    }

    public Integer getC() {
        return c;
    }

    public static Integer getD() {
        return d;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    public void setC(Integer c) {
        this.c = c;
    }

    public static void setD(Integer d) {
        MyClass.d = d;
    }

    public MyClass(Integer a, Integer b, Integer c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
