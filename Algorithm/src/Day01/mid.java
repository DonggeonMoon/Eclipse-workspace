package Day01;

import java.util.Scanner;

public class mid {
	static int med3(int a, int b, int c) {
		if(a>=b)
			if(b>=c)
				return b;
			else if(a<=c)
				return a;
			else return c;
		else if (a>c)
			return a;
		else if (b>c)
			return c;
		else return b;
		
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("정수 3개를 입력하세요:");
		
		System.out.println("첫 번째 수:");
		int a = stdIn.nextInt();
		System.out.println("둘 번째 수:");
		int b = stdIn.nextInt();
		System.out.println("셋 번째 수:");
		int c = stdIn.nextInt();
		
		
		
		System.out.println("중앙값은:"+med3(a,b,c));
	}
}
