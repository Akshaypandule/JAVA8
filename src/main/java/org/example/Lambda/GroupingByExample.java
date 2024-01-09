package org.example.Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample {

    public static void main(String[] args) {
        List<String> name= Arrays.asList("Akshay","Akshay","Avinash","Mangesh","Vijay","Vijay");

        Map<String, Long> collect = name.stream().collect(Collectors.groupingBy(p -> p, Collectors.counting()));

        System.out.println(collect);
    }
}
