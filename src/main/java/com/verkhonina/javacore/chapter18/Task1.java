package main.java.com.verkhonina.javacore.chapter18;


import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        int figure = 5;
        ArrayList<Integer> a = new ArrayList<>();

        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);

        TreeMap<Integer, Integer> nm = new TreeMap<>();

        for(int i = 0; i < a.size(); i++) {
            nm.put(i, a.get(i));
        }

        System.out.println(nm);


        for(int i = 0; i < a.size()-1; i++) {
            Integer k = a.get(i);
            System.out.println(k);
            SortedMap<Integer, Integer> set = nm.subMap(a.get(k), figure - k);
            System.out.println(set);
        }
    }
}
