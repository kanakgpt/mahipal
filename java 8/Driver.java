package com.example.crud.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver {
    public static void main(String[] args) {
        //filter
        //Map
        //Sort
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10,3,4,34,45,4,54,3,45,4,5);

        list.sort((Integer a, Integer b) -> a.compareTo(b));
        list.stream().filter(a -> a%2==0).forEach(System.out::println);
        System.out.println(list);

        list.stream().map(a -> a*a).forEach(System.out::println);
      List<Integer> squaredList = list.stream().map(a->a*a).collect(Collectors.toList());


//        6) Intermediate Operations :
//
//        map(), filter(), distinct(), sorted(), limit(), skip()
//
//        Terminal Operations :
//
//        forEach(), toArray(), reduce(), collect(), min(), max(), count(), anyMatch(), allMatch(), noneMatch(), findFirst(), findAny()
    }
}
