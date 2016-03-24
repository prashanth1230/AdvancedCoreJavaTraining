package com.generics;

import com.annotations.CustomAnnotation;

import java.lang.reflect.Field;

/**
 * Created by a487037 on 03/24/2016.
 */
public class AnnotationsInterpretor {
    public static <T> void inject(Class<T> resolveClass, T resolveInstance) {
        Field fields[] = resolveClass.getDeclaredFields();
        if (fields != null) {
            for (Field field : fields) {
                field.setAccessible(true);
                CustomAnnotation customAnnotation = field.getAnnotation(CustomAnnotation.class);
                if (customAnnotation != null) {
                    try {
                        field.set(resolveInstance, customAnnotation.value());
                    } catch (IllegalAccessException | IllegalArgumentException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
