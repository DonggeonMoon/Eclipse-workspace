package Day06;

import java.util.Scanner;

//이진 검색: 기본적으로 정렬이 되어 있어야 한다. 오름차순으로 정렬
public class BinSearch {
	
	//요소의 개수가 n인 배열 a에서 key와 같은 요소를 이진 검색해보자.
	static int binSearch(int a[], int n, int key) {
		int pl = 0; // 검색 범위의 첫 인덱스
		int pr =n-1; //검색 범위의 마지막 인덱스
		
		do {
			int pc = (pl + pr);// 중앙 요소의 인덱스
			if(a[pc] == key) return pc;
			else if(a[pc] < key)
				pl = pc+1;//검색 범위를 뒤쪽 절반으로 좁힘
			else 
				pr= pc - 1;//검색 범위를 앞쪽 절반으로 좁힘
		} while (pl<=pr);
		
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("요소의 개수:");
		
		int num = stdIn.nextInt();
		int x[] = new int[num];
		
		System.out.println("오름차순으로 입력해주세요.");
		
		for(int i=1; i< num; i++) {
			do {
				System.out.print("x["+i+"]:");
				x[i] = stdIn.nextInt();
			} while(x[i]<x[i-1]);//바로 앞의 값보다 작으면 
		}
		System.out.println("검색할 값: ");
		int ky = stdIn.nextInt();
		int idx = binSearch(x, num,ky);
		
		if(idx == -1)
			System.out.println("입력하신 값은 없습니다.");
		else
			System.out.println(ky+"은/는 x["+idx+"]에 있습니다.");
	}
}
