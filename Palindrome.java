package week2.day1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number;
		System.out.println("Enter the number : ");
		Scanner sc= new Scanner(System.in);
		number = sc.nextInt();
		int reversedNumber=0, temp = number;
		while (temp>0) 
		{
			int remainder = temp%10;
			reversedNumber = reversedNumber*10 + remainder;
			temp = temp/10;
			
		}
		if(number == reversedNumber)
		{
			System.out.println("number is palindrome ");
		}
		else
		{
			System.out.println("number is not palindrome ");
		}
		
		

	}

}
