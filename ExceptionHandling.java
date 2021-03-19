package com.company;

import java.util.Scanner;

class InvalidCodeException extends Exception{
    InvalidCodeException(String s){
        super(s);
    }
}
public class ExceptionHandling {
    static void validate(int code)throws InvalidCodeException{
        if(code==123 || code==456 || code==789)
            throw new InvalidCodeException("Delivery not available in your area!");
        else
            System.out.println("Delivery available in your area!");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int code;
        System.out.println("Enter the Zip code ");
        code = sc.nextInt();
        try{
            validate(code);
        }catch(Exception m)
        {System.out.println(m.getMessage());
        }
    }
}
