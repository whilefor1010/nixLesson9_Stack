package org.example;

import java.util.Optional;

public class Stack implements Stackable {

    private int[] arr;
    private int curIndex = -1;

    public Stack(int length) {
        this.arr = new int[length];
    }


    @Override
    public boolean isFull() {
        return curIndex == arr.length-1;
    }

    @Override
    public boolean isEmpty() {
        return curIndex < 0;
    }

    @Override
    public boolean addElement(int el) throws StackOverflowExcp{

        if (isFull()){
            //System.out.println("Stack overflow");
            //return false;
            throw new StackOverflowExcp();
        }

        curIndex++;

        arr[curIndex] = el;

        return true;

    }

    @Override
    public int getElement() throws StackEmptyExcp{
        if (isEmpty()){
            //System.out.println("Stack is empty");
            //return 0;
            throw new StackEmptyExcp();
        }

        return arr[curIndex--];

    }

    @Override
    public int lookTop() {
        if (isEmpty()){
            //System.out.println("Stack is empty");
            //return 0;
            throw new StackEmptyExcp();
        }

        return arr[curIndex];

    }

    @Override
    public Optional<Integer> lookTopOptional(){

        if (isEmpty()) {
            return Optional.empty();
        }

        return Optional.of(arr[curIndex]);

    }

}
