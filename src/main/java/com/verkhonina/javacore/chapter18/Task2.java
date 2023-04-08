package main.java.com.verkhonina.javacore.chapter18;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();

        a.add(1);
        a.add(2);
        a.add(3);
        a.add(3);
        a.add(5);

        System.out.println(checkDuplicates(a));

    }

    private static Boolean checkDuplicates(ArrayList<Integer> arr) {
        HashSet<Integer> hs = new HashSet<>(arr);
        return hs.size() != arr.size();
    }
}
