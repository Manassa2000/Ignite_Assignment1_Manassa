Q2. Write a program to sort a given binary array in linear times.

package com.company;
import java.util.*;

public class Question2 {
    public static void main(String[] args) {
        //accepting size and contents of array
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of binary array");
        int n = sc.nextInt();
        System.out.println("Enter a binary array");
        int A[] = new int[n];
        for(int i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }

        // count number of 0's
        int zeros = 0;
        for (int value : A) {
            if (value == 0) {
                zeros++;
            }
        }

        // put 0's at the beginning
        int k = 0;
        while (zeros-- != 0) {
            A[k++] = 0;
        }

        // fill all remaining elements by 1
        while (k < A.length) {
            A[k++] = 1;
        }

        // print the rearranged array
        System.out.println("After Sorting:"+Arrays.toString(A));
    }
}
