package main.java.com.verkhonina.javacore.chapter18;

/*
Дан массив целых чисел.
Необходимо реализовать метод, которые определяет, содержит ли данный массив дубликаты

Пример:
Array: [4,5,6,6,8]
Result: true
Число 6 повторяется 2 раза

Array: [4,5,6,7,8]
Result: false
Дубликатов нет
* */


import java.util.ArrayList;
import java.util.HashSet;

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
