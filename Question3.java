//Q3. Write a program that takes an integer command-line argument n and prints all the positive powers of 2 less than or equal to n. 
//Make sure that your program works properly for all values of n.

package com.company;
public class Question3 {
    public static void main(String[] args) {

        //command line argument
        int n = Integer.parseInt(args[0]);

        int i = 0;                
        int powerOfTwo = 1;       

        //find and print power of two
        while (i <= n) {
            System.out.println(i + " " + powerOfTwo);   
            powerOfTwo = 2 * powerOfTwo;                
            i = i + 1;
        }

    }
}
