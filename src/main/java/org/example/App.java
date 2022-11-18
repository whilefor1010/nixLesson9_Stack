package org.example;

public class App
{
    public static void main( String[] args )
    {

        Stack stack = new Stack(10);

        System.out.println(stack.isEmpty());

        System.out.println(stack.lookTopOptional());

        stack.addElement(1);
        stack.addElement(5);
        stack.addElement(7);

        System.out.println(stack.lookTopOptional());

        System.out.println(stack.getElement());
        System.out.println(stack.lookTop());

        for (int i = 0; i < 10; i++) {
            stack.addElement(i);
        }

        System.out.println(stack.isFull());
        System.out.println(stack.getElement());
        System.out.println(stack.lookTop());

        for (int i = 0; i < 10; i++) {
            stack.getElement();
        }

        System.out.println(stack.isEmpty());
        System.out.println(stack.lookTop());



    }
}
