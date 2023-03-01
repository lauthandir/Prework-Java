package org.example;

import java.sql.SQLOutput;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int a, b;

        System.out.println("WYNIK TO:");
        a = r.nextInt(10);
        b = r.nextInt(10);
        System.out.print(a);
        System.out.println(b);


    }
}