package com.rsr.basics;

public class Palindrome {

    public static void main(String[] args)
    {
        System.out.println(isPalindrome("5885"));
        System.out.println(isPalindrome("ravis"));
        System.out.println(isPalindrome("madam"));
    }

    //PALINDROME check
    public static boolean isPalindrome(String input)
    {
        input = input.replace(" ", "");

        StringBuffer sb = new StringBuffer(input);
        return sb.reverse().toString().equals(input);
    }

}
