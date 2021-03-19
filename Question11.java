//Program to convert decimal to binary

package com.company;
import java.util.Scanner;

public class Question11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a decimal number");
        n = sc.nextInt();
        String b = Integer.toBinaryString(n);
        System.out.println("Its binary equivalent is "+ b);
    }
}
