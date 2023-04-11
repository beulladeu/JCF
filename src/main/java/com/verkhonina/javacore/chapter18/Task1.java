package main.java.com.verkhonina.javacore.chapter18;


/*
Дан массив целых чисел. Необходимо реализовать метод, который возвращает индексы массива, значения которых в сумме дают число переданное в массив.

Предполагается, что массив содержит только уникальные числа и всегда имеет искомые числа.
Один и тот же элемент не может быть использован дважды.

array = [3, 8, 15, 17], Number = 23
result = [1,2]

Т.е. индексы 1 и 2 (значение 8 и 15) в сумме дают искомое число 23
* */

import java.util.*;


class MyPair {
    private final Integer value1;
    private final Integer value2;

    public MyPair(Integer value1, Integer value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    @Override
    public String toString() {
        return "{" + value1 + "," + value2 +'}';
    }
}

public class Task1 {
    public static void main(String[] args) {
        int figure = 5;
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(3);
        arr.add(2);
        arr.add(1);
        arr.add(4);
        arr.add(8);
        arr.add(5);
        arr.add(0);

        System.out.println(arr);

        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < arr.size(); i++) {
            hm.put(arr.get(i), i);
        }

        System.out.println("Индексы элементов с сумме дающие " + figure);

        ArrayList<MyPair> res = new ArrayList<>();
        Set<Integer> na = new HashSet<>(arr);
        for (Integer curr : na) {
            Integer diff = hm.get(figure - curr);
            if (diff != null) {
                res.add(new MyPair(hm.get(curr), diff));
                hm.remove(curr);
            }
        }
        System.out.println(res);
    }
}
