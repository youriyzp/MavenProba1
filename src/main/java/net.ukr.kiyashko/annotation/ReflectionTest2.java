package net.ukr.kiyashko.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionTest2 {

    public static void main(String[] args) throws IllegalAccessException,
            ClassNotFoundException, InstantiationException,
            NoSuchMethodException,
            InvocationTargetException {
        Class c2 = Class.forName("net.ukr.kiyashko.annotation.Other");
        Object obj = c2.newInstance();
        Other other = (Other) obj;
        final Method setGetMethod = other.getClass().getMethod("setI", Integer.class);
        setGetMethod.invoke(other, 99);
        final Method aGetMethod = other.getClass().getMethod("getI");
        final Object result = aGetMethod.invoke(other);
        System.out.println(result);
    }
}