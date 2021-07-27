package Day06;

import java.util.Arrays;
import java.util.Scanner;

//문자열의 배열에서 검색
public class StringBinarySearch {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		//자바에서 사용하는 키워드(예약어)
		String x[] = {"abstract", "assert", "boolean","break", "byte", "case",
				"catch", "char", "class", "const", "continue", "default", "do",
				"else", " enum", "extends", "final", "finally", "float", "for",
				"for", "goto", "if", "implements", "import", 
				"instanceof", "int", "interface", "long", "native", "new",
				"pacakage", "private", "protected", "public", "return",
				"short", "static", "throw", "throws", "transient", "try",
				"void", "volatile", "while"
				};
		
		System.out.println("원하는 키워드를 입력하세요");// 키값을 입력하세요.
		
		String ky = stdIn.next();
		
		int idx = Arrays.binarySearch(x, ky);
		if(idx <0)
			System.out.println("해당 키워드가 없습니다.");
		else
			System.out.println("해당 키워드는 x["+idx+"]에 있습니다.");
	}
}
