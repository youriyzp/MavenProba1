package net.ukr.kiyashko.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class ReflectionTest {

    public static void main(String[] args) throws IllegalAccessException, ClassNotFoundException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class c2 = Class.forName("net.ukr.kiyashko.annotation.Other");
        Object obj = c2.newInstance();
        Other other = (Other) obj;
        final Method setGetMethod = other.getClass().getDeclaredMethod("setI", Integer.class);
        setGetMethod.setAccessible(true);
        setGetMethod.invoke(other, 99);
        final Method aGetMethod = other.getClass().getDeclaredMethod("getI");
        aGetMethod.setAccessible(true);
        final Object result = aGetMethod.invoke(other);
        System.out.println(result);
    }
}
