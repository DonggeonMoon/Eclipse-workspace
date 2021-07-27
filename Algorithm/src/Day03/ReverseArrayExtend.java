package Day03;

import java.util.Scanner;

public class ReverseArrayExtend {
	static void print(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
			if(i!=a.length-1) {
				System.out.print(", ");
			}
		}
		System.out.println();
	}
	static void swap(int a[], int idx1, int idx2) {
		print(a);
		System.out.println("a["+idx1+"]와 a["+idx2+"]를 교환합니다.");
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
		print(a);
	}
	static void reverse(int a[]) {
		for(int i=0;i<a.length /2 ; i++) {
			swap(a, i, a.length - i -1);
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("요소 개수 :");
		int num = stdIn.nextInt();
		
		int x [] = new int[num];
		
		for(int i=0; i < num ; i++) {
			System.out.println("x[" + i +"] : ");
			x[i] = stdIn.nextInt();
		}
		
		reverse(x);
		
		System.out.println("역순으로 정렬했습니다.");
		
		for(int i=0; i<num; i++) {
			System.out.println("x[" + i +"] = " + x[i]);
		}
		stdIn.close();
	}
}
