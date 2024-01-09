package org.example.Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Duplicate {

    public static void main(String[] args) {

        List<Integer> l=new ArrayList<>();
        l.add(10);
        l.add(10);
        l.add(60);
        l.add(15);
        l.add(15);
        l.add(16);

        System.out.println(l.stream().distinct().collect(Collectors.toList()));
    }
}
