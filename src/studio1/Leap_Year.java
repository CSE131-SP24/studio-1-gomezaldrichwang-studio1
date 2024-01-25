package studio1;

import java.util.Scanner;

public class Leap_Year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner year = new Scanner(System.in);
		System.out.println("What year is it?");
		int currentYear = year.nextInt();
		int remainderBy4 = currentYear%4;
		int remainderBy100 = currentYear%100;
		int remainderBy400 = currentYear%400;
		boolean isLeapYear = remainderBy4 == 0 && remainderBy100 != 0 || remainderBy400 == 0;
		System.out.println(isLeapYear);
	}

}
