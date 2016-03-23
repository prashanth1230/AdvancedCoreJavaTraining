package com.exceptions;

/**
 * Created by a487037 on 03/23/2016.
 */
public class InterfaceException extends Exception {
    public InterfaceException() {
    }

    public InterfaceException(String message) {
        super(message);
    }

    public InterfaceException(String message, Throwable cause) {
        super(message, cause);
    }

    public InterfaceException(Throwable cause) {
        super(cause);
    }

    public InterfaceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
