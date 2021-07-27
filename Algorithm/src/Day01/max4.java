package Day01;

import java.util.Scanner;

public class max4 {
	
	static int max4(int a, int b, int c, int d) {
		
		int max = a;
		if (b > max) max = b;
		if (c > max) max = c;
		if (d > max) max = d;
		
		return max;
	}
	
	public static void main(String[] args) {
		System.out.println("max4(5, 10, 29, 33):"+max4(5, 10, 29, 33));
		System.out.println("max4(24, 30, 21, 22:)"+max4(24, 30, 21, 22));
		System.out.println("max4(91, 105, 78, 99):"+max4(91, 105, 78, 99));
		System.out.println("max4(1066, 2129, 3120, 1200):"+max4(1066, 2129, 3120, 1200));
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 4개 중 가장 큰 것을 출력합니다.\n첫번째 숫자:");
		int a = sc.nextInt();
		System.out.println("두 번째 숫자");
		int b = sc.nextInt();
		System.out.println("세 번째 숫자");
		int c = sc.nextInt();
		System.out.println("네 번째 숫자");
		int d = sc.nextInt();
		
		System.out.println("가장 큰 수는:"+max4(a, b, c, d));
		
		sc.close();
	}
}
