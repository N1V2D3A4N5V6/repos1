package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
                int n = (int)Math.round(Math.random() + 6);
        System.out.println("n="+n);
        int a = (int)Math.random() +6;
        System.out.println("a="+a);
        String s = "Hello world";
        s.replace("o","_");
        System.out.println(s);
        // Вызов статического метода
        Myclass1.RunMe();
        // Вызов метода экземпляра
        Myclass1 myobj = new Myclass1();
        myobj.RunMe2();
    }
}
