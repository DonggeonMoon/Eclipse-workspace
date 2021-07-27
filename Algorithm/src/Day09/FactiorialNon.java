package Day09;

import java.util.Scanner;
//비재귀적으로 팩토리얼을 구해보자. n!=1*2*...*(n-1)*n
public class FactiorialNon {
	
	static int nonRecursive(int n) {
		
		int m = 1;
		
		for(int i=n;i>0;i--) {
			m*=i;
		}
		return m;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("팩토리얼 몇을 구하시겠습니까:");
		int x = stdIn.nextInt();
		
		System.out.println(String.valueOf(x)+"의 팩토리얼은 "+nonRecursive(x)+"입니다.");
	}
}