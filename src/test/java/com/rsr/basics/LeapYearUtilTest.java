package com.rsr.basics;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LeapYearUtilTest
{

    @Test
    public void testNonCent_Leaps() throws Exception
    {
        //arrange data

        //act & assert
        assertTrue(LeapYearUtil.isLeapYear(2004));
        assertTrue(LeapYearUtil.isLeapYear(1996));
    }

    @Test
    public void testCent_Leaps() throws Exception
    {
        assertTrue(LeapYearUtil.isLeapYear(1600));
        assertTrue(LeapYearUtil.isLeapYear(2000));
    }

    @Test
    public void test_NonLeaps() throws Exception
    {
        assertFalse(LeapYearUtil.isLeapYear(2007));
        assertFalse(LeapYearUtil.isLeapYear(2013));
    }

    @Test
    public void testCent_NonLeaps() throws Exception
    {
        assertFalse(LeapYearUtil.isLeapYear(1800));
        assertFalse(LeapYearUtil.isLeapYear(1700));
    }
}