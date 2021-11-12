package com.company;
import java.util.*;

class Myclass1 {

    public static void RunMe() {
        char c2;
        float f = 1 + new Random().nextFloat() * (1000000 - 1);
        int i = Math.round(f);
        byte b = (byte)i;
        double y = Math.pow(i, 5) / Math.log(f) - Math.sin(f) / b;

        System.out.println("b = " + b);
        System.out.println("f = " + f);
        System.out.println("i = " + i);
        System.out.println("y = " + y);
    }

    public void RunMe2() {
        System.out.println("Test proc2");
    }
}

