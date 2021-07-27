package Day03;

import java.util.Scanner;

public class MinofArray {
	
	static int minofArray(int a[]) {
		int min = a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		} return min;
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("가장 작은 수를 구합니다.");
		System.out.println("총 몇 개?:");
		int num = stdIn.nextInt();
		
		int[] a = new int[num];
		
		for(int i=0;i<a.length;i++) {
			System.out.println("a["+i+"]: ");
			a[i] = stdIn.nextInt();
		}
		
		System.out.println("가장 작은 수는 "+minofArray(a)+"입니다.");
		stdIn.close();
	}
}
