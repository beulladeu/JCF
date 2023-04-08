package main.java.com.verkhonina.javacore.chapter18;

import java.util.Comparator;
import java.util.TreeSet;

class MyComp implements Comparator<String> {
    public int compare(String a, String b) {
        String aStr, bStr;
        aStr = a;
        bStr = b;
        //сорт в обр порядке
        return bStr.compareTo(aStr);
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>(new MyComp());

        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        for(String el: ts)
            System.out.print(el + " ");

        System.out.println();


        //====================

        TreeSet<String> ts2 = new TreeSet<>((aStr, bStr) -> bStr.compareTo(aStr));

        ts2.add("C");
        ts2.add("A");
        ts2.add("B");
        ts2.add("E");
        ts2.add("F");
        ts2.add("D");

        for(String el: ts2)
            System.out.print(el + " ");

        System.out.println();
    }
}
