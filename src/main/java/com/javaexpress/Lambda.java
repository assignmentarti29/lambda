package com.javaexpress;
import java.util.Arrays;
import java.util.List;

public class Lambda {



        public static void main(String[] args) {

            List<String> names = Arrays.asList("Arati", "Rahul", "Neha","Nilesh");

            names.forEach(name -> System.out.println(name));
            System.out.println("Hey Arati");
        }
    }


