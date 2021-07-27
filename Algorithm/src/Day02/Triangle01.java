package Day02;

import java.util.Scanner;

public class Triangle01 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("삼각형을 출력합니다.");
		do {
			System.out.println("몇 단으로 찍을까요?");
			n = stdIn.nextInt();
		} while(n <= 0);//1 이상의 값을 입력 받게 하기 위해 처리.
		
		//1.
		
		for (int i=1; i<=n ;i++) {
			for (int j=1; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----------------");
		
		//2. 
		for (int i=1;i<=n; i++) {
			for(int j=n; j>=i;j--) {
				System.out.print("*");
			}
			System.out.print(" ");
			System.out.println();
		}
		
		System.out.println("------------------------------------------");
		//3.
		for (int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=n;j>=i;j--) {
				System.out.print("*");
			}
			System.out.print(" ");
			System.out.println();
		}
		System.out.println("------------------------------------------");
		//4.
		for (int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//i = 1, j = 1번 반복
	//i = 2, j = 2번 반복
	//     ...
}