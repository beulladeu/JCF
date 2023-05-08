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

    public static MyPair findSum(int[] nums, int target) {

        Map<Integer, Integer> valueIndexMap = new HashMap();

        for(int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            Integer candidate = valueIndexMap.get(diff);
            if (candidate != null) {
                return new MyPair(i, candidate);
            }

            valueIndexMap.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int target = 12;
        int[] array = {8, 5, 4, 3, 7, 2};

        System.out.println(Arrays.toString(array));
        System.out.println("Индексы элементов с сумме дающие " + target);

        MyPair res = findSum(array, target);

        System.out.println(res);
    }
}
