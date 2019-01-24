package net.ukr.kiyashko.lab2_12;

public interface InterfaceMyComparator  {
        default int compare(String[] o1, String[] o2) {
        int value1 = Integer.parseInt(o1[1]);
        int value2= Integer.parseInt(o2[1]);
        return Integer.compare(value1,value2);

    }
}
