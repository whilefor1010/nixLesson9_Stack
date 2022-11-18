package org.example;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


public class AppTest 
{

    @Test
    public void shouldLookTop()
    {

        Stack stack = new Stack(10);

        stack.addElement(1);
        stack.addElement(5);
        stack.addElement(7);

        assertEquals(7,stack.getElement());
        assertEquals(5,stack.lookTop());



    }

    @Test
    public void shouldStackOverflowExcp() {

        Stack stack = new Stack(1);
        stack.addElement(1);

        try {
            stack.addElement(5);
            fail("ooops excp doesn't work");
        }catch(Exception e){
            if (!(e instanceof StackOverflowExcp)){
                System.out.println("its work but no good");
            }
        }

    }

    @Test
    public void shouldStackEmptyExcp() {

        Stack stack = new Stack(10);


        try {
            stack.lookTop();
            fail("ooops excp doesn't work");
        }catch(Exception e){
            if (!(e instanceof StackEmptyExcp)){
                System.out.println("its work but no good");
            }
        }

    }

    @Test
    public void shouldOptionalEmpty() {

        Stack stack = new Stack(10);

        Optional<Integer> t = stack.lookTopOptional();

        assertEquals(Optional.empty(), t);

    }


}
