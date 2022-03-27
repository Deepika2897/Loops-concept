package com.loops;

public class PositiveNegative {

	public static void main(String[] args) {
		int num=-11;
		if(num>0)
		{
			System.out.println(num+ "is positive");
			
			if(num%2==0)
			{
				System.out.println("the number is even");
			}
			if(num%2==1)
			{
				System.out.println("the number is odd");
			}
		}
			else
			{System.out.println(num+ "the number is negative");
			}
		}
}