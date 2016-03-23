package com.exceptions;

/**
 * Created by a487037 on 03/23/2016.
 */
public class MarkerImplReflection implements Marker {
    private void checkInterface() throws InterfaceException {
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

    public static void main(String[] args) {
        MarkerImplReflection marker = new MarkerImplReflection();
        try {
            marker.checkInterface();
        } catch (InterfaceException e) {
            e.printStackTrace();
        }
    }
}
