package main.java.com.verkhonina.javacore.chapter18;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackDemo {

    static void showPush(Stack<Integer> st, int a) {
        st.push(a);
        System.out.println("push = " + a);
        System.out.println("стек: " + st);
    }

    static void showPop(Stack<Integer> st) {
        Integer a = st.pop();
        System.out.println("pop = " + a);
        System.out.println("стек: " + st);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        System.out.println("стек: " + st);

        showPush(st, 42);
        showPush(st, 66);
        showPush(st, 99);
        showPop(st);
        showPop(st);
        showPop(st);

        try {
            showPop(st);
        } catch (EmptyStackException e) {
            System.out.println("Стек пуст");
        }
    }
}
