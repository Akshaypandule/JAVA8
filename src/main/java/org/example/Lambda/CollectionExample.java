package org.example.Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionExample {

    public static void main(String[] args) {
        List<Integer> l= Arrays.asList(10,20,6,96,466,18);
        System.out.println("Without lambda expression");
        for(int i=0;i<l.size();i++){


            System.out.println(l.get(i));
        }

        System.out.println("With lambda expression");
        l.forEach((x)-> System.out.println(x));
    }
}
