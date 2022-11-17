package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
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
}
