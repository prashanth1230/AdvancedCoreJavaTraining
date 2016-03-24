package com.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by a487037 on 03/24/2016.
 */
public class ConsumerExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Virat", "Dhoni", "Nehra");
        List<String> list = new ArrayList<>();
        Consumer<String> consumer = System.out::println;
        Consumer<String> consumer1 = list::add;

        strings.forEach(consumer.andThen(consumer1));
        System.out.println("Size of the result: " + list.size());
    }
}
