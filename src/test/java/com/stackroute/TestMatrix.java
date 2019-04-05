package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNull;

public class TestMatrix {
    private static Matrix matrix;
    @BeforeClass
    public static void setup(){
        matrix = new Matrix();
    }
    @AfterClass
    public static void Teardown(){
        matrix=null;
    }
    @Test
    public void matrix(){
        assertEquals("check the addition function ","10 10 10 10 10 10",matrix.addition(3,2,new int[] {21,12,33,64,25,61},new int[] {-2,5,-11,-6,3,19}));
    }
    @Test
    public void matrixFailure(){
        assertNull("The function should not accept 0 as rows or column",matrix.addition(0,1,new int[] {21,12,33,64,25,61},new int[] {-2,5,-11,-6,3,19}));
    }
}
