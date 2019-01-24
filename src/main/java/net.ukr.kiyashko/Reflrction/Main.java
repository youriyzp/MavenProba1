package net.ukr.kiyashko.Reflrction;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, ClassNotFoundException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class c = Class.forName("net.ukr.kiyashko.Reflrction.MyClass");
        String s = c.getName();
        System.out.println(s);
        Field[] fields = c.getDeclaredFields();
        int mods = c.getModifiers();
        for (Field field : fields) {

            System.out.println();
        }
    }
           /* Object obj = c.getDeclaredConstructor();
            MyClass myClass1 = (MyClass) obj;
            final Method setGetMethod = myClass1.getClass().getDeclaredMethod("setA", Integer.class);
            setGetMethod.setAccessible(true);
            setGetMethod.invoke(myClass1, 55);
            final Method aGetMethod = myClass1.getClass().getDeclaredMethod("getA");
            aGetMethod.setAccessible(true);
            final Object result = aGetMethod.invoke(myClass1);
            System.out.println(result);*/
}
