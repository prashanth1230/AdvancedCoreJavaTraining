package com.exceptions;

/**
 * Created by a487037 on 03/23/2016.
 */
public class Main {
    public static void main(String[] args) {
        Lion lion = new Lion();
        System.out.println("com.exceptions.Lion type " + (lion instanceof Lion));
        System.out.println("com.exceptions.Animal type " + (lion instanceof Animal));
        try {
            //Unchecked Exceptions. Does not need a try/catch all the time
            int x = 1/0;
            Object o = new Lion();
            String s = (String) o;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
