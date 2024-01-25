package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("The first of two integers to be averaged");
		double n1 = in.nextDouble(); 
		Scanner in2 = new Scanner(System.in);
		System.out.print("The second of two integers to be averaged");
		double n2 = in2.nextDouble(); 
		System.out.print((n1 + n2)/2); 
	}

}
