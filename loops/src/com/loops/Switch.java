package com.loops;

public class Switch {

public static void main(String[] args)

{
char input='5';
switch(input)
{
case 'a':
case 'b':
case 'c':
case 'd':
case 'e':
case 'f':
case 'g':
case 'h':
case 'i':
{
	System.out.println("This is a alphabet");
	break;
}
case '1':
case '2':
case '3':
case '4':
case '5':
{
	System.out.println("this is a digit");
			break;
}
case '@':
case '%':
case '(':
{
	System.out.println("this is a special character");
	break;
}
default :
	System.out.println("Invalid");
}
}
}

