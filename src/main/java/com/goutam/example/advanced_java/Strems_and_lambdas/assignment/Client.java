package com.goutam.example.advanced_java.Strems_and_lambdas.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Client {
    public static void main(String[] args) {
        example8();
    }
    public static void example1(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(8);
        list.add(2);
        list.add(9);
        list.add(6);
        list.add(3);

        list.stream()
                .forEach((ele) ->{
            System.out.println(ele);
        });

        }

        public static void example2(){
            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(4);
            list.add(8);
            list.add(2);
            list.add(9);
            list.add(6);
            list.add(3);

            list.stream()
                    .forEach((ele) ->{
                        System.out.println(ele*ele);
                    });

        }
    public static void example3(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(8);
        list.add(2);
        list.add(9);
        list.add(6);
        list.add(3);

        list.stream()
                .map(ele->ele*ele)
                .forEach(ele ->System.out.println(ele));

    }
    public static void example4(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(8);
        list.add(2);
        list.add(9);
        list.add(6);
        list.add(3);

        list.stream()
                .filter(ele->ele%2==0)
                .map(ele->ele*ele)
                .forEach(ele ->System.out.println(ele));

    }
    public static void example5(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(8);
        list.add(2);
        list.add(9);
        list.add(6);
        list.add(3);

        int listsum = list.stream()
                            .reduce(0,(sum,ele)->{
                return ele+sum;
        });
        System.out.println(listsum);

    }
    public static void example6(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(8);
        list.add(2);
        list.add(9);
        list.add(6);
        list.add(3);

        List<Integer> sortedlist = list.stream()
                        .sorted().collect(Collectors.toList());

        System.out.println(sortedlist);

    }
    public static void example7(){
        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(4);
        list.add(8);
        list.add(2);
        list.add(9);
        list.add(6);
        list.add(3);

            Optional<Integer> first =  list.stream()
                    .map(ele->ele*ele)
                            .findFirst();


        System.out.println(first.get());

    }
    public static void example8(){
        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(4);
        list.add(8);
        list.add(2);
        list.add(9);
        list.add(6);
        list.add(3);

        list.parallelStream().forEach(ele ->{
            System.out.println(ele + " Printing from :" + Thread.currentThread().getName());
        });

    }
}
