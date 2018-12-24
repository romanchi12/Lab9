package org.romanchi;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyClassTest {

    @Test
    public void multiplyTest() {
        MyClass myClass = new MyClass();
        assertEquals("10x5 must be 50 ",50,myClass.multiply(10,5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void multiplyTestException(){
        MyClass myClass = new MyClass();
        myClass.multiply(1000,5);
    }

}