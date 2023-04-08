package main.java.com.verkhonina.javacore.chapter18;

import java.util.LinkedList;

public class MainList {
    static class Address {
        private String name;
        private String street;
        private String city;
        private String state;
        private String code;

        Address(String n, String s, String c, String st, String cd) {
            name = n;
            street = s;
            city = c;
            state = st;
            code = cd;
        }

        @Override
        public String toString() {
            return "Address {" +
                    "name='" + name + '\'' +
                    ", street='" + street + '\'' +
                    ", city='" + city + '\'' +
                    ", state='" + state + '\'' +
                    ", code='" + code + '\'' +
                    '}';
        }
    }
    public static void main(String[] args) {
        LinkedList<Address> ml = new LinkedList<>();
        ml.add(new Address("J.W. West", "11 Oak Ave", "Urbana", "IL", "61801"));
        ml.add(new Address("Ralf Baker", "1142 Maple Lane", "Mahomet", "IL", "61853"));

        for (Address el: ml) {
            System.out.println(el);
            System.out.println();
        }
    }
}
