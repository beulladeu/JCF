package main.java.com.verkhonina.javacore.chapter18;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}

public class HashMapDemo {
    public static void main(String[] args) {
        //HashMap<int, String> c = new HashMap<>();

        Person p = new Person("", 13);
        HashMap<Person, String> hm = new HashMap<>();
        hm.put(p, "test");

        //------------------------------

        HashMap<String, Double> hm1 = new HashMap<>();
        hm1.put("Джон Доу", 3434.34);
        hm1.put("Том Смит", 123.22);
        hm1.put("Джейн Бейкер", 1378.00);
        hm1.put("Тод Холл", 99.22);
        hm1.put("Ральф Смит", -19.08);

        Set<Map.Entry<String, Double>> set = hm1.entrySet();

        for(Map.Entry<String, Double> me : set) {
            System.out.println(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        double balance = hm1.get("Джон Доу");
        hm1.put("Джон Доу", balance + 1000);
        System.out.println("Новый остаток на счете Джона Доу: "
                + hm1.get("Джон Доу"));
    }
}
