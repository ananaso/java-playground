package com.galvanize.exceptions;

public class ThrowingExceptions {
    public void run() throws IceCreamException {
        throw new IceCreamException("Sorry, no vanilla left");
    }
}
