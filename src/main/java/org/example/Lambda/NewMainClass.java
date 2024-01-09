package org.example.Lambda;

import org.example.Demo.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NewMainClass {

    public static void main(String[] args) {
        List<Employee> emp=new ArrayList<>();

        emp.add(new Employee(101,"Akshay",560000.00));
        //emp.add(new Employee(101,"Soma",560000.00));
        emp.add(new Employee(107,"Sanjay",560000.00));
        emp.add(new Employee(102,"Mangesh",650000));
        emp.add(new Employee(103,"Satish",45000));
        emp.add(new Employee(106,"Prmod",75000));

        System.out.println("********* List to Map Conversion **********");
        Map<Integer, Employee> collect = emp.stream()
                .collect(Collectors.toMap((p) -> p.getEmpId(), (p) -> p));
        System.out.println(collect);

        System.out.println("********************************************");

        List<String> collect1 = emp.stream().filter(p -> p.getName().startsWith("A")
                || p.getName().startsWith("S")).map(q->q.getName()).collect(Collectors.toList());
        System.out.println(collect1);

        System.out.println("********************************************");



    }
}
