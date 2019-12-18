package com.taras;

public class Factory {
    public static  Factory instance = new Factory();
    public BookOperations bookOperations;

    private Factory() {}

    public static Factory getInstance() {
        return Factory.instance;
    }

    public BookOperations getBookOperations() {
        if (bookOperations ==  null)  bookOperations = new BookOperationsImpl();
        return bookOperations;
    }

}
