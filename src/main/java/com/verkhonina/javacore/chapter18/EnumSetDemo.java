package main.java.com.verkhonina.javacore.chapter18;

import java.util.EnumSet;

public class EnumSetDemo {

    enum Courses {
        Math, English, Art, ComputerScience
    }

    public static void main(String[] args) {

        EnumSet<Courses> sset;

        sset = EnumSet.of(Courses.Math);
        System.out.println("1 - " + sset);

        sset = EnumSet.of(Courses.Math, Courses.English, Courses.ComputerScience);
        System.out.println("2 - " + sset);
    }
}
