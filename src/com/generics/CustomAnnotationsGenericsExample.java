package com.generics;

import com.annotations.CustomAnnotation;

/**
 * Created by a487037 on 03/24/2016.
 */
public class CustomAnnotationsGenericsExample {

    @CustomAnnotation("Inject the value to the field")
    private String field;

    public static void main(String[] args) {
        CustomAnnotationsGenericsExample instance = new CustomAnnotationsGenericsExample();
        AnnotationsInterpretor.inject(CustomAnnotationsGenericsExample.class, instance);
        System.out.println(instance.field);
    }
}
