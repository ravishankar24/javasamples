package com.rsr.basics;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class PalindromeTest
{
    Palindrome a ;

    @Before
    public void prepareApp()
    {
        a = new Palindrome();
    }

    @Test
    public void testPalindrome() throws Exception
    {
        assertTrue(a.isPalindrome("madam"));
        assertFalse(a.isPalindrome("ravis"));
        assertTrue(a.isPalindrome("58685"));
        assertTrue(a.isPalindrome("NA N B N   AN"));
    }
}
