package org.example;

public class StackOverflowExcp extends RuntimeException{

    public StackOverflowExcp() {
        super("Stack overflow");
    }

}
