package com.bridgelabz.logicalprogram;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		System.out.println("Enter a Number :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
			
		int divisorSum=1;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				divisorSum=divisorSum+i;			    		
			}
		}
        if(divisorSum==num)
        {
        	System.out.println("Perfect number");
        }else
        	System.out.println("Not a perfect number");
	}

}
