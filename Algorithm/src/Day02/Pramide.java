package Day02;

import java.util.Scanner;

public class Pramide {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("피라미드 모양을 나타냅니다.");
		
		do {
			System.out.println("몇 단으로 찍을까요?");
			n = stdIn.nextInt();
		} while(n <= 0);
		
		for (int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print(" ");
			}
			
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			
			for(int j=1; j<=i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
