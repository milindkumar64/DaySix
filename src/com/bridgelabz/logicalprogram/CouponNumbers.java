package com.bridgelabz.logicalprogram;

import java.util.Random;

public class CouponNumbers {

	public static void main(String[] args) {
		
		int couponArr[] = {123,127,244,535,355,442,24,25,255,55};
		int randNum=0;
		int count=1;
		Random rn = new Random();
		for(int i=0;i<couponArr.length;i++)
		{
			while(couponArr[i]!=randNum) 
			{
		    randNum = rn.nextInt(1000);
		    count++;
		    }
	    }
		System.out.println("total number of trial to get all Coupon Number is  :"+count);

}
}
