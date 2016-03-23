package com.exceptions;

/**
 * Created by a487037 on 03/23/2016.
 */
public class CustomAutoClosable implements AutoCloseable {

    public void doSomeThing() {
        System.out.println("Do Something");
    }
    @Override
    public void close() throws Exception {
        System.out.println("Auto close invoked.");
    }
}
