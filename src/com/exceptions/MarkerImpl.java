package com.exceptions;

/**
 * Created by a487037 on 03/23/2016.
 */
public class MarkerImpl implements Marker {
    public void checkInterface() throws InterfaceException {
        if (this instanceof Marker) {
            System.out.println("Interface implemented");
        } else {
            throw new InterfaceException("Interface not implemented.");
        }
    }
    public static void main(String[] args) {
        MarkerImpl marker = new MarkerImpl();
        try {
            marker.checkInterface();
        } catch (InterfaceException e) {
            e.printStackTrace();
        }
    }
}
