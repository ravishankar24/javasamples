package com.rsr.basics;

public class LeapYearUtil {

    public static void main(String[] args) {
        LeapYearUtil.isLeapYear(1800);
    }

    public static boolean isLeapYear(int year)
    {
        if(year%400==0)
        {
            return true;
        }
        else if (year%4==0 && year%100!=0)
        {
            return true;
        }

        return false;
    }
}