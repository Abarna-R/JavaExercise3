package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestStudMarks {
    private static StudentMarks studentmarks;


    @BeforeClass
    public static void setup() {
        studentmarks = new StudentMarks();
    }

    @AfterClass
    public static void teardown() {
        studentmarks = null;
    }
    @Test

    public void teststumarks()
    {
        assertEquals("the grade is not between 0 and 100 ",true, studentmarks.marks(3,new int[]{78,76,54}));
        assertEquals("the grade is not between 0 and 100 ",true, studentmarks.marks(4,new int[]{78,76,54,86}));
        assertEquals("the grade is not between 0 and 100 ",true, studentmarks.marks(5,new int[]{78,76,54,98,100}));
        assertNotEquals("the grade is between 0 and 100",false,studentmarks.marks(3,new int[]{78,76,54}));
    }

    @Test
    public void teststumarks1()
    {
        assertNotNull("it is a null value",studentmarks.marks(3,new int[]{78,76,54}));
    }


}
