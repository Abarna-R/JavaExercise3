package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestChess {
    private static Chess chess;
    @BeforeClass
    public static void setup(){
        chess = new Chess();
    }
    @AfterClass
    public static void Teardown(){
        chess = null;
    }
    @Test
    public void TestChess(){
        assertEquals("This is not the Chess board pattern",
                "WW|BB|WW|BB|WW|BB|WW|BB|\n" + "BB|WW|BB|WW|BB|WW|BB|WW|\n" +
                "WW|BB|WW|BB|WW|BB|WW|BB|\n" + "BB|WW|BB|WW|BB|WW|BB|WW|\n" +
                "WW|BB|WW|BB|WW|BB|WW|BB|\n" + "BB|WW|BB|WW|BB|WW|BB|WW|\n" +
                "WW|BB|WW|BB|WW|BB|WW|BB|\n" + "BB|WW|BB|WW|BB|WW|BB|WW|",chess.Board());
    }
    @Test
    public void TestChess1() {
        assertNotNull("Its is a null value", chess.Board());
    }
}
