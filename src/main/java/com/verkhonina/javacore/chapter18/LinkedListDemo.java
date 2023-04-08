package main.java.com.verkhonina.javacore.chapter18;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> l1 = new LinkedList<>();

        l1.add("F");
        l1.add("B");
        l1.add("D");
        l1.add("E");
        l1.add("C");
        l1.addLast("Z");
        l1.addFirst("A");
        l1.add(1, "A2");

        System.out.println("Исходное содержимое связного списка l1: " + l1);

        l1.remove("F");
        l1.remove(2);

        System.out.println("Содержимое связного списка l1 " +
                "после удаления элементов: " + l1);

        l1.removeFirst();
        l1.removeLast();

        System.out.println("Содержимое связного списка l1 " +
                "после удаления первого и последнего элементов: " + l1);

        String val = l1.get(2);
        l1.set(2, val + "changed");

        System.out.println("Содержимое связного списка l1 " +
                "после изменения: " + l1);

        LinkedList<Integer> l2 = new LinkedList<>();

        l2.add(1);
        l2.add(2);
        l2.add(4);
        l2.add(3);

        System.out.println("Содержимое связного списка l2 " + l2);

        l2.remove(2);
        System.out.println("Содержимое связного списка l2 " + l2);

    }
}
