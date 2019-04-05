package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestDate {
    private static CalculateDate date;
    @BeforeClass
    public static void setup(){
        date = new CalculateDate();
    }
    @AfterClass
    public static void Teardown(){
        date =null;
    }
    @Test
    public void TestDate(){
        assertEquals("It is not throwing any exception","java.lang.NegativeArraySizeException",date.Date());
    }
    @Test
    public void DateFailure(){
        assertNotNull("It is a null value",date.Date());
    }
}
