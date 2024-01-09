package org.example.Lambda;

import java.util.Optional;

public class OptionalClass {

    public static void main(String[] args) {

       Optional<String> s =display("Abc");

        if(s.isPresent())
        {
            System.out.println(true);
        }
        else {
            System.out.println("false");
        }

    }

    public static Optional<String> display(String i){

        Optional<String> d=Optional.of(i);
        return d;
    }
}
