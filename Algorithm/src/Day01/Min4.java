package Day01;

import java.util.Scanner;

public class Min4 {
	static int min4(int a, int b, int c, int d) {
		int min = a;
		if(b < min) min = b;
		if(c < min) min = c;
		if(d < min) min = d;
		
		return min;
	}
	public static void main(String[] args) {
		System.out.println("min4(5, 10, 29, 33):"+min4(5, 10, 29, 33));
		System.out.println("min4(24, 30, 21, 22:)"+min4(24, 30, 21, 22));
		System.out.println("min4(91, 105, 78, 99):"+min4(91, 105, 78, 99));
		System.out.println("min4(1066, 2129, 3120, 1200):"+min4(1066, 2129, 3120, 1200));
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 4개 중 가장 작은 것을 출력합니다.\n첫번째 숫자:");
		int a = sc.nextInt();
		System.out.println("두 번째 숫자");
		int b = sc.nextInt();
		System.out.println("세 번째 숫자");
		int c = sc.nextInt();
		System.out.println("네 번째 숫자");
		int d = sc.nextInt();
		
		System.out.println("가장 작은 수는:"+min4(a, b, c, d));
		
		sc.close();
	}

}
