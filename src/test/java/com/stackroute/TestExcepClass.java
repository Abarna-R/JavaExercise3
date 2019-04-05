package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestExcepClass {
    private static ExceptionClass Class;
    @BeforeClass
    public static void setup(){
        Class = new ExceptionClass();
    }
    @AfterClass
    public static void Teardown(){
        Class=null;
    }
    @Test
    public void exception(){
        assertEquals("This is an error message","The message is error message thrown from try",Class.Classs("some text"));
    }
    @Test
    public void exceptionFailure(){
        assertNotNull("This method is failed",Class.Classs("some text"));
    }
}
