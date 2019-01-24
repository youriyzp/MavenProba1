package net.ukr.kiyashko.lab2_11;

public class MyException extends Exception{
   private String c;
   MyException(String c){
       this.c=c;
   }
   public void getMyExeption(){
       System.out.println(c);

   }



}
