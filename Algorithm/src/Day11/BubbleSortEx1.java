package Day11;

import java.util.Scanner;
//인근한 두 요소가 교환을 수행하면 +붙여서 출력하고, 수행하지 않았으면 -붙여서 출력
//정렬을 마친후 비교 횟수와 교환 횟수를 출력해보자.
public class BubbleSortEx1 {
	//배열의 요소 a[idx1]과 a[idx2]를 교환
	static void swap(int a[], int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	//단순 교환 정렬
	static void bubbleSort(int a[], int n) {
		int ccnt = 0; //비교 횟수
		int scnt = 0; //교환 횟수
		
		for(int i =0 ; i < n-1 ; i++) {
			System.out.printf("패스%d : \n", i+1);			
			for(int j = n-1 ; j > i; j--) {				
				for(int k = 0; k < n-1; k++) {
					System.out.printf("%3d %c", a[k], 
						(k != j-1)?' ':(a[j-1] > a[j])? '+':'-');
				}
				System.out.printf("%3d\n", a[n-1]);
				ccnt++;
				if(a[j-1] > a[j]) {
					scnt++;
					swap(a,j-1,j);
				}				
			}
			
			for (int m=0; m <n ; m++)
				System.out.printf("%3d", a[m]);
			System.out.println();
			
		}
		
		System.out.println("비교를 " + ccnt + "회 했습니다.");
		System.out.println("교환을 " + scnt + "회 했습니다.");
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("버블 정렬 : ");
		System.out.println("요소의 갯수 : ");
		int nx = stdIn.nextInt();
		int x[] = new int[nx];
		
		for(int i=0; i < nx; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}
		
		bubbleSort(x, nx);

	}

}
