package Day01;

import java.util.Scanner;
//정수 3개를 입력받아 그 중에 가장 큰 값을 출력해보자.
public class Max3 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수 3개의 값을 입력하세요.");
		System.out.println("a의 값: ");
		int a = stdIn.nextInt();
		
		System.out.println("b의 값: ");
		int b = stdIn.nextInt();
		
		System.out.println("c의 값: ");
		int c = stdIn.nextInt();
		
		int max = a;
		if (b > max) max = b;
		if (c > max) max = c;
		
		System.out.println("최대값은 "+max+"입니다.");
	}

}
