package org.example.Lambda;

public class StringExample {

    public static void main(String[] args) {

        String s1="Akshay";
        String s2="Akshay";
        String s3=new String("Akshay");

        String s5=new String("Akshay P");
        String s4=s2;

        System.out.println(s1==s2);  // true
        System.out.println(s1.equals(s2)); //true

        System.out.println(s4);
        System.out.println(s4==s1);
        System.out.println(s1.equals(s4));

        
        System.out.println(s3==s1);   // false --- Check Memory reference
        System.out.println(s3.equals(s1));  //true check contents

        System.out.println("S1 hash code "+s1.hashCode());
        System.out.println("s2 hash code "+s2.hashCode());
        System.out.println("s3 hash code "+s3.hashCode());
        System.out.println("s4 hash code "+s4.hashCode());
        System.out.println("s5 hash code "+s5.hashCode());

    }
}
