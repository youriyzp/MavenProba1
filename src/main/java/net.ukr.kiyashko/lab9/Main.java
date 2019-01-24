package net.ukr.kiyashko.lab9;

public class Main {
    public static void main(String[] args) {
        String myStr = "abracadabra";

       // myStr.indexOf("ra");

        System.out.println(myStr.indexOf("ra"));
        System.out.println(myStr.lastIndexOf("ra"));
        System.out.println(myStr.substring(3,7));
        reverseString(myStr);
    }


    static void reverseString(String myStr){
        StringBuffer sb = new StringBuffer(myStr);
        sb.reverse();
        System.out.println(sb);

            }

    }

