package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestVowel {
    private static Vowel vowel;
    @BeforeClass
    public static void setup(){
        vowel = new Vowel();
    }
    @AfterClass
    public static void Teardown(){
        vowel =null;
    }
    @Test
    public void TestRemoveVowels(){
        assertEquals("Vowels are not removed","nd",vowel.RemoveVowels("India"));
        assertEquals("Vowels are not removed","Untd Stts",vowel.RemoveVowels("United States"));
        assertEquals("Vowels are not removed","Grmny",vowel.RemoveVowels("Germany"));
        assertEquals("Vowels are not removed","gypt",vowel.RemoveVowels("Egypt"));
    }
    @Test
    public void vowelFailure(){
        assertNotNull("Its is a Null value",vowel.RemoveVowels("China"));
    }

}
