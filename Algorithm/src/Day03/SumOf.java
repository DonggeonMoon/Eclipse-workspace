package Day03;

import java.util.Scanner;

public class SumOf {
	static int sumOf(int[] a) {
		int sum = 0;
		for(int i=0; i<a.length;i++) {
			sum += a[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자들의 합을 구합니다.");
		System.out.println("숫자 개수:");
		
		int num = scanner.nextInt();
		int a[] = new int[num];
		for (int i=0; i<a.length;i++) {
			System.out.println("a["+i+"]: ");
			a[i] = scanner.nextInt();
		}
		
		System.out.println("숫자들의 합은 "+sumOf(a));
		
		scanner.close();
	}

}
