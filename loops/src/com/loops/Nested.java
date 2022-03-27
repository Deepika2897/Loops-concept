package com.loops;

public class Nested {

	public static void main(String[] args) {
		int num=8;
		if(num>0)
		{
			System.out.println(num+ "is positive");	
			if(num<0)
			{
				System.out.println(num+ "is negative");
			}
			if(num%2==0)
			{
				System.out.println("the number is even");
			}
		
			else
			{System.out.println(num+ "the number is odd");
			}
		}
	}

}
