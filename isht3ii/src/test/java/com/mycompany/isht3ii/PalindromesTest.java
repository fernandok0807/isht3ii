/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.isht3ii;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author enmanuel
 */
public class PalindromesTest {
    
    public PalindromesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of evaluate method, of class Palindromes.
     */
    @Test
    public void whenBasicInput_thenTrueOutput() {
        System.out.println("TEST #1 - whenBasicInput_thenTrueOutput");
        String input = "abcdcba";
        boolean expectedResult = true;
        boolean actualResult = Palindromes.evaluate(input);
        assertEquals(expectedResult, actualResult);
        
    }
    
    @Test
    public void whenEmptyInput_thenTrueOutput() {
        System.out.println("TEST #2 - whenEmptyInput_thenTrueOutput");
        
        // given
        String input = "";
        boolean expectedResult = true;
        
        
        // when
        boolean actualResult = Palindromes.evaluate(input);

        // then
        assertEquals(expectedResult, actualResult);

    }
    
    @Test
    public void whenOneCharInput_thenTrueOutput() {
        System.out.println("TEST #3 - whenOneCharInput_thenTrueOutput");
        
        // given
        String input = "a";
        boolean expectedResult = true;
                
        // when
        boolean actualResult = Palindromes.evaluate(input);

        // then
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void whenTwoCharsInput_thenFalseOutput() {
        System.out.println("TEST #4 - whenTwoCharsInput_thenFalseOutput");
        
        // given
        String input = "ab";
        boolean expectedResult = false;
                
        // when
        boolean actualResult = Palindromes.evaluate(input);

        // then
        assertEquals(expectedResult, actualResult);

    } 
    

    @Test(expected=IllegalArgumentException.class)
    public void whenNullInput_thenException() {
        System.out.println("TEST #5 - whenNullInput_thenException");
        
        // given
        String input = null;
        //throw expectedResult = throw new IllegalArgumentException("You can't pass a null String as input.");
                
        // when
        boolean actualResult = Palindromes.evaluate(input);

        // then
    }
    
    @Test   
    public void whenLongStringInput_thenFalseOutput() {
        System.out.println("TEST #6 - whenLongStringInput_thenFalseOutput");
        
        // given
        String input = "ana lleva al oso la avellana";
        boolean expectedResult = false;
                
        // when
        boolean actualResult = Palindromes.evaluate(input);

        // then
        assertEquals(expectedResult, actualResult);

    }
    
    @Test   
    public void whenStringWithTabInput_thenFalseOutput() {
        System.out.println("TEST #7 - whenStringWithTabInput_thenFalseOutput");
        
        // given
        String input = "reconocer\treconocer";
        boolean expectedResult = true;
                
        // when
        boolean actualResult = Palindromes.evaluate(input);

        // then
        assertEquals(expectedResult, actualResult);

    }
    
    
    @Test   
    public void whenStringTwoLinesInput_thenTrueOutput() {
        System.out.println("TEST #8 - whenStringTwoLinesInput_thenTrueOutput");
        
        // given
        String input = "reconocer a ana\n"
                + "ana a reconocer";
        boolean expectedResult = true;
                
        // when
        boolean actualResult = Palindromes.evaluate(input);

        // then
        assertEquals(expectedResult, actualResult);

    }
    
     @Test   
    public void whenStringWithSpaceInput_thenTrueOutput() {
        System.out.println("TEST #9 - whenStringWithSpaceInput_thenTrueOutput()");
        
        // given
        String input = "lala ese alal";
        boolean expectedResult = true;
                
        // when
        boolean actualResult = Palindromes.evaluate(input);

        // then
        assertEquals(expectedResult, actualResult);

    }
    
}
