package com.reflections;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by a487037 on 03/23/2016.
 */
public class TestReflection {
    public static void main(String[] args) {
        Class<?> clazz = null;
        try {
            clazz = Class.forName("com.reflections.MarkerImplReflection");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //Instantiation of an object using reflection
        try {
            Object markerImpl = clazz.newInstance();
            Method methods[] = clazz.getMethods();
            for (Method method : methods) {
                if (method.getName().equals("checkInterface")) {
                    method.invoke(markerImpl);
                }
            }
            Method privateMethods[] = clazz.getDeclaredMethods();
            for (Method method : privateMethods) {
                if (method.getName().equals("helloPrivate")) {
                    method.setAccessible(true);
                    method.invoke(markerImpl);
                }
            }
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
