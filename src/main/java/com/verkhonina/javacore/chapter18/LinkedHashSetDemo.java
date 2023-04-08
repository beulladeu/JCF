package main.java.com.verkhonina.javacore.chapter18;


import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Джон Доу");
        lhs.add("Том Смит");
        lhs.add("Джейн Бейкер");

        System.out.println(lhs);

        lhs.remove("Том Смит");

        System.out.println(lhs);

    }
}
