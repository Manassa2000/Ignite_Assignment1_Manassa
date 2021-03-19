//program to find gcd of two numbers using euclid's algorithm

package com.company;
import java.util.Scanner;
public class Question10   
{  
public static void main(String[] args)   
{  
//x and y are the numbers to find the GCF
Scanner sc=new Scanner(System.in);
int gcd = 1; 
System.out.println("Enter two numbers to find gcd");
 int x=sc.nextInt();
 int y=sc.nextInt();
//running loop form 1 to the smallest of both numbers  
for(int i = 1; i <= x && i <= y; i++)  
{  
//returns true if both conditions are satisfied   
if(x%i==0 && y%i==0)  
//storing the variable i in the variable gcd  
gcd = i;  
}  
//prints the gcd  
System.out.println("GCD:"+gcd);  
}  
}  

