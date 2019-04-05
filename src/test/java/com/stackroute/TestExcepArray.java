package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestExcepArray {
    private static ExceptionArray array;
    @BeforeClass
    public static void setup(){
        array = new ExceptionArray();
    }
    @AfterClass
    public static void Teardown(){
        array =null;
    }
    @Test
    public void Restnegativ(){
        assertEquals("the function negativeException is not throwing any exception","java.lang.NegativeArraySizeException",array.negativ(23));
    }
    @Test
    public void TestoutOfBound(){
        assertEquals("the function outOfBoundException is not throwing any exception","java.lang.ArrayIndexOutOfBoundsException: 2",array.outOfBound(5,3));
    }
    @Test
    public void TestnullPointer(){
        assertEquals("the function nullPointerException is not throwing any exception","java.lang.NullPointerException",array.nullPointer());
    }
    @Test
    public void NegativFailure(){
        assertNotNull("The function is not working",array.negativ(-3));
    }
}
