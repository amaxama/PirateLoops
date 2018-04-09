/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foobar;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author annamaxam
 */
public class PirateLoopsTest {
    
    private PirateLoops pirateLoops = new PirateLoops();
    
    public PirateLoopsTest() {
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

    @Test
    public void testAnswer() {
        
        int[] numbers = {1,0};
        assertEquals(2, pirateLoops.answer(numbers));
       
    }
    
    @Test
    public void testAnswer2() {
        
        int[] numbers = {1,2,1};
        assertEquals(2, pirateLoops.answer(numbers));
       
    }
    
    @Test
    public void testAnswer3() {
        
        int[] numbers = {1,4,3,2,2,3};
        assertEquals(2, pirateLoops.answer(numbers));
       
    }
    
    @Test
    public void testAnswer4() {
        
        int[] numbers = {1,3,0,1};
        assertEquals(2, pirateLoops.answer(numbers));
       
    }
    
    @Test
    public void testAnswer5() {
        
        int[] numbers = {1,8,3,4,6,1,7,3,2};
        assertEquals(4, pirateLoops.answer(numbers));
       
    }
    
    @Test
    public void testAnswer6() {
        
        int[] numbers = {1,2,3,1,0};
        assertEquals(3, pirateLoops.answer(numbers));
       
    }
    
    
    
}
