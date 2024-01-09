package org.example.Lambda;

import org.example.Interface.Test;
import org.example.Interface.Test1;

public class Example1 {
    public static void main(String[] args) {

        String x="Akshay";

        Test t1=(t)->{

                System.out.println(t);
        };
        t1.show("Welcome");


        Test1 s=()->{
            return "Welcome to pune";
        };

        System.out.println(s.show());

    }
}
