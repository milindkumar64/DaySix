package com.bridgelabz.logicalprogram;

import java.util.Scanner;

public class SimulateStopwatch {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		long start,end;
		double tim;
		
		System.out.println("Enter any key to start the stopwatch"); 
		String st=sc.next();
		 
		start=System.currentTimeMillis();
		
		System.out.println("Enter any key to stop the stopwatch");
		String stp=sc.next();
		
		end=System.currentTimeMillis();
		
		tim=(end-start)/1000;
		System.out.println(tim);		
	}

}
