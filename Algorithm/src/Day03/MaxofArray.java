package Day03;

import java.util.Scanner;
//배열: 자료 타입 -reference type: 주소값 참조
//   : 같은 자료형의 집합. 다른 자료형은 불가..
//     객체 다형성 : 부모 객체 타입으로 자식의 다른 객체를 담을 수 있다.
public class MaxofArray {
	//배열 a의 최대값을 구해보자.
	
	static int maxOf(int a[]) {
		int max = a[0];
		for (int i=1;i<a.length;i++) {
			if(a[i]> max) {
				max = a[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("가장 큰 키의 값을 구합니다.");
		System.out.println("사람 수:");
		int num = stdIn.nextInt();
		
		int height[] = new int[num];
		for (int i=0;i<height.length;i++) {
			System.out.println("height["+i+"]: ");
			height[i] = stdIn.nextInt();
		}
		
		System.out.println("가장 큰 키의 값은"+maxOf(height)+"입니다.");
		
		stdIn.close();
	}

}
