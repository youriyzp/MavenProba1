package net.ukr.kiyashko;

import java.util.Date;
import java.util.Map;

public  class Test {
   public static void main(String argv[]) {
       double d1 = 5.0;
       double d2 = 2.3;
       double power = Math.pow(d1, d2);
       System.out.println(power);
       Map<String,String>props=System.getenv();
       System.out.println(props.get("SystemDrive"));
       Date date=new Date();
       date.getTime();
       System.out.println(date);
      /*
       int i=1;
      switch (i){
         case 0:
            System.out.println("zero");break;
         case 1:
               System.out.println("1");
         case  2:
                  System.out.println("2");
                  default:
                     System.out.println("default");

      }
    /*  int i=51;
      byte b=1;
      while (b<i){
         b=++i*2;
         System.out.println(b+","+i);
      }
      /*outer:for (i=1;i<3;i++){
         inner:for (j=1;j<3;j++){
         if (j==2)
            continue outer;
            System.out.println("i="+i+" j="+j);

         }
      }
     /* String result="1";
      int score=10;
      if ((score=score+10)==100)
         result ="A";
      else if ((score=score+29)==50)
         result="B";
      else  if ((score=score+200)==10)
         result ="C";
      else result="F";
      System.out.println(result+":"+score);

   /*   amethod();
   }
   public static  void amethod() {

      int k = 10;
      switch (k) {
         default:
            System.out.println("defoult");
            break;
         case 10:
            System.out.println("ten");
         case 20:
            System.out.println("twenty");
            break;

      }
      /*do
         while (i<15)
            i=i+20;
         while (i<2);

                 System.out.println(i);
/*public  void localVariableInLoop(){*/

 /*  for (int i=12;i>0;i-=3)
      System.out.print(i);
      System.out.println("");

   System.out.println(ctr);

     int i=15;
     do {
        i++;
     } while (++i>20);
      System.out.println(i);

     while (++i>20){
        i++;
             }
   System.out.println(i);
     /*float f=4.3;
     double d =  1.8;
     int c=0;
     if (i==f)
        c++;
     if (((int)(f+d))==((int)f+(int)d))
        c+=2;
   System.out.println(c);
     /* boolean b = true;
      if (b) {
         i = 1;
      }
      System.out.println(i);*/
   }
}