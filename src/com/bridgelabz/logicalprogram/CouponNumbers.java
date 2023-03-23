package com.bridgelabz.logicalprogram;

import java.util.Random;

public class CouponNumbers {

	public static void main(String[] args) {

		String couponArr[] = { "d4B4", "AC7D", "FB2e", "3A82", "6DE9" };
		String randNum = "0";
		int count = 1;
		Random rn = new Random();
		

		for (int i = 0; i < couponArr.length; i++) {
			while (!(couponArr[i].equals(randNum)))

			{
				randNum = getAlphaNumericString();
				count++;
			}
			count++;

		}

		System.out.println("total number of trial to get all Coupon Number is  :" + count);

	}
	

	static String getAlphaNumericString() {

		String AlphaNumericString = "ABCDEF" + "0123456789" + "abcdef";

		// creating 6 digit StringBuffer

		StringBuilder sb = new StringBuilder(4);

		for (int i = 0; i < 4; i++) {

			// generate a random number between
			// 0 to AlphaNumericString variable length
			int index = (int) (AlphaNumericString.length() * Math.random());

			// add Character one by one in end of sb
			sb.append(AlphaNumericString.charAt(index));
		}
		//System.out.println(sb.toString());
		return sb.toString();

	}
}
