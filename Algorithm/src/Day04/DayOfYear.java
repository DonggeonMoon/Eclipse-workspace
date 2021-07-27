package Day04;

import java.util.Scanner;

public class DayOfYear {
	
	static int mdays[][] = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
	};
	
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 !=0 || year % 400 == 0) ? 1 : 0; 
	}
	
	static int dayOfYear(int y, int m, int d) {
		int days = d;
		
		for(int i=1; i < m ; i++) {
			days += mdays[isLeap(y)][i-1];
		}
		
		return days;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int retry = 1;
		System.out.println("해당 해 경과일수를 구합니다.");
		
		do {
			System.out.println("년: ");
			int year = stdIn.nextInt();
			System.out.println("월: ");
			int month = stdIn.nextInt();
			System.out.println("일: ");
			int day = stdIn.nextInt();
			
			System.out.printf("%d년의 %d째 날입니다.\n",
					year, dayOfYear(year, month, day));
			System.out.println("다시 할까요? (1.예 / 0.아니오) :");
			retry = stdIn.nextInt();
		} while(retry==1);
	}
}
