package com.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by a487037 on 03/24/2016.
 */
public class ComparatorExample {
    public static void main(String[] args) {
        Comparator<String> comparator = (String s1, String s2) -> Integer.compare(s1.length(), s2.length());

        List<String> list = new ArrayList<>();
        list.add("Virat");
        list.add("Nehra");
        list.add("Sachin");
        Collections.sort(list, comparator);
        for (String value : list) {
            System.out.println(value);
        }
    }
}
