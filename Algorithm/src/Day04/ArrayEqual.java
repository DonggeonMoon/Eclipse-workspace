package Day04;

import java.util.Scanner;

public class ArrayEqual {
// 두개의 밸이 같은지 판단
//1. 두 배열의 길이가 같은지?
//2. 길이가 같으면.. 배열의 인덱의 내용이 같은지 비교
	
	static boolean equals(int a[], int b[]) {
		if(a.length != b.length) {
			return false;
		}
		
		for(int i =0;i<a.length;i++) {
			if(a[i]!=b[i]) {
				return false;
			}
		} return true;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("배열 요수의 개수:");
		
		int na = stdIn.nextInt();
		int a[] = new int[na];
		
		for(int i=0;i<na;i++) {
			System.out.println("a["+i+"]: ");
			a[i] = stdIn.nextInt();
		}
		
		System.out.println("배열 요수의 개수:");
		
		int nb = stdIn.nextInt();
		int b[] = new int[nb];
		
		for(int i=0;i<nb;i++) {
			System.out.println("b["+i+"]: ");
			b[i] = stdIn.nextInt();
		}
		
		System.out.println("배열 a와 b는 "+(equals(a, b)?"같습니다.":"다릅니다."));
	}

}
