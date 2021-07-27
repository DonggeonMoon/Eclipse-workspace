package Day09;

import java.util.Scanner;

//최대공약수를 비재귀적으로 구해보자.
public class EuclidGCDNon {
	//정수 x, y의 최대 공약수를 비재귀적으로 구하여 반환
	static int gcdNon(int x, int y) {
		
		while(true) {
			int r = y;
			y = x % y;
			x = r;
			if (y==0) return r;
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("두 정수의 최대 공약수를 구합니다.");
		System.out.println("정수를 입력하세요:");
		int x = stdIn.nextInt();
		System.out.println("정수를 입력하세요:");
		int y = stdIn.nextInt();
		
		System.out.println("최대 공약수는 "+gcdNon(x,y)+"입니다.");
		
		 
	}
}
