package com.reflections;

import com.exceptions.InterfaceException;
import com.exceptions.Marker;

/**
 * Created by a487037 on 03/23/2016.
 */
public class MarkerImplReflection implements Marker {
    public void checkInterface() throws InterfaceException {
        Class<?> clazz = this.getClass();
        Class<?> interfaces[] = clazz.getInterfaces();
        boolean flag = false;
        for (int i = 0; i < interfaces.length; i++) {
            if(interfaces[i].getSimpleName().equals("Marker")) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("Interface is implemented");
        }
    }

    private void helloPrivate() {
        System.out.println("Private method");
    }

    public static void main(String[] args) {
        MarkerImplReflection marker = new MarkerImplReflection();
        try {
            marker.checkInterface();
        } catch (InterfaceException e) {
            e.printStackTrace();
        }
    }
}
