package net.ukr.kiyashko.lab_collection;

import java.util.*;

public class MyCollection {
    public static class Main {
        public static void main(String argv[]) {
            List<String> list1 = new ArrayList<String>();
            list1.add("First");
            list1.add("Second");
            list1.add("Thirt");
            list1.add("Forty");
            list1.add("Fifty");
            list1.add("Sixty");
            list1.add("Seventy");
            String[] a = {"One", "Two", "Three"};
            List<String> list2 = new ArrayList<String>();
            list2.addAll(0, list1);
            List<String> list3 = new ArrayList<String>();
            list3.addAll(list2);
            list2.addAll(list2.size() / 2, list3);
            list3.addAll(Arrays.asList(a));

            ListIterator<String> iter = list3.listIterator();
            int i = 0;
            while (iter.hasNext()) {
                iter.next();
                if (i % 2 == 0) {
                    iter.remove();
                }
                i++;
            }
            System.out.println(list3);
            Set<String> set = new HashSet<String>();
            set.add("Set1");
            set.add("Set2");
            set.addAll(list1);
            set.addAll(list2);
            System.out.println(set);
            Set<String> set2= new LinkedHashSet<String>();
            set2.addAll(list2);
            set2.addAll(list3);
            System.out.println(set2);
            Map<Integer,String> map1 = new LinkedHashMap();
            map1.put(1,"Janvie");
            map1.put(2,"February");
            map1.put(3,"March");
            map1.put(4,"April");
            map1.put(5,"May");
            map1.put(6,"June++Otpusk");
            map1.put(7,"Joly");
            map1.put(8,"August");
            map1.put(9,"Septembre");
            map1.put(10,"Octobre");
            map1.put(11,"Novembre");
            map1.put(12,"Decembre");
            //System.out.println(map1.get(1)+map1.get(11));
            System.out.println(map1);
            Map<Integer,String> map2 = new HashMap<>();
            map2.putAll(map1);
            map2.entrySet();
            System.out.println(map1);
            System.out.println(map2);
            Map<String,String> map3= new HashMap<>();
            map3.put("Youriy","0676183367,kiyashko@ukr.net,skype");
            //Set<String>;





        }
    }

}
