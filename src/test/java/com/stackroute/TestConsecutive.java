package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestConsecutive {
    private static ConsecutiveNum consec;


    @BeforeClass
    public static void setup() {
        consec= new ConsecutiveNum();


    }

    @AfterClass
    public static void teardown() {
        consec= null;

    }
    @Test
    public void testconsec()
    {

        assertEquals("This is not consecutive numbers",true,consec.Consec("78,79,80,81"));
        assertEquals("This is not consecutive numbers",true,consec.Consec("7,8,9,10"));
        assertEquals("This is not consecutive numbers",true,consec.Consec("21,22,23,24"));
        assertNotEquals("This is consecutive numbers",false,consec.Consec("1,3,4,5"));
    }
    @Test
    public void testconsec1()
    {
        assertNotNull("it is a null value",consec.Consec("12,13,14,15"));
    }

}
