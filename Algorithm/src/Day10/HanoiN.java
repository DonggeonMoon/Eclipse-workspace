package Day10;
import java.util.Scanner;

public class HanoiN {
	
	static void move(int n, int x, int y) {
		int xstk [] = new int[100];
		int ystk [] = new int[100];
		int sstk [] = new int[100]; //스택
		int ptr = 0; //스택의 포인터
		int sw = 0;
		
		while(true) {
			if(sw == 0 && n >1) {
				xstk[ptr] = x;
				ystk[ptr] = y;
				sstk[ptr] = sw;
				ptr++;
				n = n -1;
				y = 6 - x - y;
				continue;
			}
			
			System.out.printf("[%d]를 %d기둥에서 %d기둥으로 옮김\n",n,x,y);
			
			if(sw == 1 && n > 1) {
				xstk[ptr] = x;
				ystk[ptr] = y;
				sstk[ptr] = sw;
				ptr++;
				n = n-1;
				x = 6-x-y;
				if(++sw == 2)
					sw = 0;
				continue;
			}
			do {
				if(ptr-- ==0)
					return;
				x = xstk[ptr];
				y = ystk[ptr];
				sw = sstk[ptr] + 1;
				n++;
			}while(sw==2);
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("하노이의 탑");
		System.out.print("원반의 갯수：");
		int n = stdIn.nextInt();

		move(n, 1, 3); // 1기둥에 쌓인 n 개를 3기둥에 옮김

	}

}
