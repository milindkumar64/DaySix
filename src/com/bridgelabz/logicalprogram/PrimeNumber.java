package com.bridgelabz.logicalprogram;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int num = 12;
		int check=0;
	    if(num<2)
	    {
	     System.out.println("not a prime number");
	    }		
		for(int i =2;i<=num/2;i++)
		{
		  if(num%i==0)
		  {  System.out.println("Not a prime Number");
		     check=1;
		     break;
		  }
		}
		if(check==0)
		System.out.println("given number is prime number");
	}

}
