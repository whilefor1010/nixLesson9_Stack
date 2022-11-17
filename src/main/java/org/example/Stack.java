package org.example;

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
    public boolean addElement(int el) {

        if (curIndex == arr.length-1){
            System.out.println("Stack overflow");
            return false;
        }

        curIndex++;

        arr[curIndex] = el;

        return true;

    }

    @Override
    public int getElement() {
        if (curIndex < 0){
            System.out.println("Stack is empty");
            return 0;
        }

        return arr[curIndex--];

    }

    @Override
    public int lookTop() {
        if (curIndex < 0){
            System.out.println("Stack is empty");
            return 0;
        }

        return arr[curIndex];

    }
}
