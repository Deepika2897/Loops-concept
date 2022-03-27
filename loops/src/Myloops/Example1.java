package Myloops;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		int start, end;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the start value:");
		start =scanner.nextInt();
		System.out.println("Enter the end value:");
		end=scanner.nextInt();
		for(;start<=end;start++)
		{
			if(start%2==0)
			{
				System.out.println(start);
			}
			scanner.close();
			}
		}

	}


