package main.java.com.verkhonina.javacore.chapter18;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

class Customer {

    private int id;
    private String name;

    public Customer(int i, String n) {
        this.id = i;
        this.name = n;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}


public class PriorityQueueDemo {

    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>(5);
        Random rand = new Random();
        for(int i = 0; i < 5; i++){
            pq.add(rand.nextInt(100));
        }

        for(int i = 0; i < 5; i++){
            Integer value = pq.poll();
            System.out.println("Value: " + value);
        }

        //-----------------
        Queue<Customer> cpq = new PriorityQueue<>(7, idComparator);
        addDataToQueue(cpq);

        pollDataFromQueue(cpq);

    }

    public static Comparator<Customer> idComparator = new Comparator<Customer>(){

        @Override
        public int compare(Customer c1, Customer c2) {
            return (int) (c1.getId() - c2.getId());
        }
    };

    private static void addDataToQueue(Queue<Customer> customerpq) {
        Random rand = new Random();
        for(int i = 0; i < 7; i++){
            int id = rand.nextInt(100);
            System.out.println("Добавление клиента с id = " + id);
            customerpq.add(new Customer(id, "N "+ id));
        }
    }

    private static void pollDataFromQueue(Queue<Customer> customerpq) {
        while(true){
            Customer c = customerpq.poll();
            if (c == null) break;
            System.out.println("Обработка клиента с id = " + c.getId());
        }
    }
}
