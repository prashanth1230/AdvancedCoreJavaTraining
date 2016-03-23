package com.exceptions;

/**
 * Created by a487037 on 03/23/2016.
 */
public class TestAutoClosable {
    public static void main(String[] args) {
        try (CustomAutoClosable customAutoClosable = new CustomAutoClosable()) {
            customAutoClosable.doSomeThing();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //Not needed
           //customAutoClosable.close();
        }
    }
}
