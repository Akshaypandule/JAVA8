package org.example.Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class limitExample {

    public static void main(String[] args) {
        List<Integer> number=new ArrayList<>();
        number.add(15);
        number.add(20);
        number.add(25);
        number.add(5);
        number.add(7);
        number.add(66);
        number.add(23);

        System.out.println(number.stream().limit(4).collect(Collectors.toList()));

        List<Integer> collect = number.stream().limit(4).filter(p -> p > 10).collect(Collectors.toList());

        System.out.println(collect);

        List<Integer> collect1 = number.stream().filter(p -> p > 10).limit(5).collect(Collectors.toList());

        System.out.println(collect1);

        System.out.println("-_------__------______------_____---___-----");
        List<Integer> collect2 = number.stream().sorted(Collections.reverseOrder()).limit(1).collect(Collectors.toList());

        System.out.println(collect2);

        // Write a Program find Second largest number in above list
        System.out.println("Second largest number-");
        number.stream().sorted(Collections.reverseOrder()).limit(2).skip(1)
                .forEach(p-> System.out.println(p));


        System.out.println("Find out Third number");

        number.stream().sorted().limit(3).skip(2).forEach(p-> System.out.println(p));

    }

}
