package Day01;

import java.util.Scanner;

public class Max3_1 {
	
	static int max3(int a, int b, int c) {
		
		int max = a;
		if(b > max) max = b;
		if(c > max) max = c;
		return max;
	}
	
	public static void main(String[] args) {	
		System.out.println("max(3, 2, 1)의 최댓값:"+max3(3, 2, 1));
		System.out.println("max(2, 3, 1)의 최댓값:"+max3(2, 3, 1));
		System.out.println("max(1, 2, 3)의 최댓값:"+max3(1, 2, 3));
		System.out.println("max(5, 3, 4)의 최댓값:"+max3(5, 3, 4));
		System.out.println("max(0, 9, 3)의 최댓값:"+max3(0, 9, 3));
		System.out.println("max(2, 8, 7)의 최댓값:"+max3(2, 8, 7));
	}
	
}
