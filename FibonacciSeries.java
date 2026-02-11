package week2.day1;

import java.util.Iterator;
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range: ");
		int range = sc.nextInt();
		int f = 0;
		int s = 1;
		
		System.out.println("Fibonacci Series: ");
		for (int i = 0; i < range; i++) {
			System.out.println(f+ " ");
			int next = f + s;
			f = s;
			s = next;
			
		}
		sc.close();
			
		
		

	}

}
