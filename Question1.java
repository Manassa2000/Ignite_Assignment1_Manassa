//Q1. Write a program that takes three integer command line arguments and prints equal if all three are equal, and not equal otherwise.

package com.company;

public class Question1 {
    public static void main(String[] args)
    {
        //Converting strings to integers and checking
        if(Integer.parseInt(args[0])==Integer.parseInt(args[1]) && Integer.parseInt(args[1])==Integer.parseInt(args[2]))
        {
            System.out.println("Equal");
        }
        else
        {
            System.out.println("Not equal");
        }
    }
}
