package com.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by a487037 on 03/23/2016.
 */
public class MarkerImpl implements Marker {
    private void checkInterface() throws InterfaceException {
        if (this instanceof Marker) {
            System.out.println("Interface implemented");
        } else {
            throw new InterfaceException("Interface not implemented.");
        }
    }
    public static void main(String[] args) {
        MarkerImpl marker = new MarkerImpl();
        try(InputStream inputStream = new FileInputStream("src/com/exceptions/Animal.java")) {
            int data;
            while ((data=inputStream.read()) != -1) {
                System.out.print((char)data);
            }
            marker.checkInterface();
        } catch (InterfaceException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //Not needed now
            //inputStream.close();
            System.out.println("Inside finally..");
        }
    }
}
