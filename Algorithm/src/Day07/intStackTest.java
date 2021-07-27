package Day07;

import java.util.Scanner;
//5.검색, 6.비움, 7.정보 표시 case에 추가해서 작성
//14번 라인 수정.. switch에서 case 5, 6, 7 추가..
public class intStackTest {
	
	public static void main(String[] args) {
		Scanner stdIn= new Scanner(System.in);
		IntStack s = new IntStack(10);
		
		while(true) {
			System.out.println("현재 데이터의 수: "+s.size()+" / "+s.capacity());
			System.out.println("1.push, 2.pop, 3.peek, 4.dump, 5.indexOf, 6.clear(), 7.capacity(), 0.exit");
			
			int menu = stdIn.nextInt();
			if(menu == 0) break;
			
			int x;
			switch (menu) {
				case 1://push
					System.out.print("데이터:");
					x=stdIn.nextInt();
					try {
						s.push(x);
					} catch(IntStack.OverflowIntStackException e) {
						System.out.println("스택이 가득 찼습니다.");
					}
					break;
				case 2://pop
					try {
						x=s.pop();
						System.out.println("pop한 데이터는:"+x+"입니다.");
					} catch(IntStack.OverflowIntStackException e) {
						System.out.println("스택이 비어 있습니다.");
					}
					break;
				case 3://peek
					try {
						x=s.peek();
						System.out.println("peek한 데이터는:"+x+"입니다.");
					} catch(IntStack.OverflowIntStackException e) {
						System.out.println("스택이 비어 있습니다.");
					}
					break;
				case 4://dump
						s.dump();
					break;
				case 5:
					System.out.println("찾을 값:");
					x = stdIn.nextInt();
					int n = s.indexOf(x);
					if(n>=0)
						System.out.println("꼭대기부터"+(s.size()-n)+"번째에 있습니다.");
					else
						System.out.println("찾는 데이터가 없습니다.");
				case 6:
					s.clear();
				case 7:
					System.out.println("용량: " + s.capacity());
					System.out.println("데이터 개수: " + s.size());
					System.out.println("비어: " + (s.isEmpty()?"있습니다.":"있지 않습니다."));
					System.out.println("가득: " + (s.isFull()?"있습니다.":"있지 않습니다."));
			}
		}
	}
}
