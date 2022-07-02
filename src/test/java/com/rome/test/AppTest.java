package com.rome.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void feedContainsInfo()
    {
        try {
            RomeClass feedTest = new RomeClass();
            assertTrue(feedTest.stringAttribute().length() > 0);
        } catch (Exception e) {
            e.printStackTrace();
            // Fail our test
            assertTrue(false);
        }

    }
}
