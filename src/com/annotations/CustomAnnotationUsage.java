package com.annotations;

import java.lang.reflect.Field;

/**
 * Created by a487037 on 03/23/2016.
 */
public class CustomAnnotationUsage {

    @CustomAnnotation("Value set through annotation.")
    public String field;

    public static void main(String[] args) {
        Class<?> clazz = CustomAnnotationUsage.class;
        try {
            Field field = clazz.getField("field");
            CustomAnnotation customAnnotation = field.getAnnotation(CustomAnnotation.class);
            System.out.println(customAnnotation.value());
        } catch (NoSuchFieldException | SecurityException e) {
            e.printStackTrace();
        }
    }
}
