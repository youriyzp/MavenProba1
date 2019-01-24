package net.ukr.kiyashko.lab9_2;


//import static com.sun.xml.internal.bind.v2.schemagen.Util.equalsIgnoreCase;

public class Main {
    public static void main(String[] args) {
        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";
        char[] myStr1Char = myStr1.toCharArray();
        char[] myStr2Char = myStr2.toCharArray();
        String myStr1ChartoSring ="";
        String myStr2ChartoSring="";
        String myStr3 = "";
        //StringBuffer sb = new StringBuffer(myStr3);

        for (int i = 0; i < myStr1.length(); i++) {

                       for (int j = 0; j < myStr2.length();
                 j++) {

                    if ( String.valueOf(myStr1Char[i]).equalsIgnoreCase(String.valueOf(myStr2Char[j]))) {

                    }

                        else{
                            myStr3 = String.valueOf(myStr1Char[i]);
                            myStr3 += myStr3;
                        }
                }
            }
            System.out.println(myStr3);
            //System.out.println(sb.toString());
        }
    }


