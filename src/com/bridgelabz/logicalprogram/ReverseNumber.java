package com.bridgelabz.logicalprogram;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Number :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
	    int rev=0;
        int rem=0;
        for(int i=0;num>0;i++)
        {
        	rem=num%10;
        	rev = (rev*10)+rem;
        	num=num/10;
       
        }
		System.out.println("Reversed number is :"+rev);
        
	}

}