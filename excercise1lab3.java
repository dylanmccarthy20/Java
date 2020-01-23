//excercise1lab3.java
/*This program reads in user-supplied numbers and uses the arithmetic operators
 *to perform some calculations on them*/
 
import java.util.Scanner;

public class excercise1lab3{
	public static void main(String args[])
	{
		int a=5, b=3, c=2, x;
		
		x = a * b % c - 4 + 6;
		
		System.out.println("The value of a is" + a + "\nThe value of b is " + b + 
							"\nThe value of c is " + c + "\n\nThe value of the expression"
							" a * b % c -4 + 6 is " + x);