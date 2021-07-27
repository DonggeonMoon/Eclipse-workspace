package Day08;
//int형 큐
public class IntQueue {
	private int max; //큐의 용량
	private int front;// 첫번째 요소 커서
	private int rear;// 마지막 요소 커서
	private int num;// 현재 데이터 수
	private int que[];// 큐 본체 , 배열로 저장함..
	
	//실행 시 예외 : 큐가 비어 있음
	public class EmptyIntQueueException extends RuntimeException {
		public EmptyIntQueueException() {}
	}
	
	//실행 시 예외 : 큐가 가득 참
	public class OverflowIntQueueException extends RuntimeException{
		public OverflowIntQueueException() {}
	}
	
	//생성자
	public IntQueue(int capacity) {
		num = front = rear = 0;
		max = capacity;
		try {
			que= new int[max]; //본체용 베열을 생성
		}catch(OutOfMemoryError e) {//생성할 수 없음.
			max = 0;
		}
	}
	
	//큐에 데이터를 인큐 : 데이터를 삽입
	public int enque(int x) throws OverflowIntQueueException{
		if (num >= max)
			throw new OverflowIntQueueException();
		que[rear++] = x;
		num++;
		if(rear == max)
			rear=0;
		return 0;
	}
	
	//큐에서 데이터를 디큐 :데이터를 꺼냄
	public int deque() throws EmptyIntQueueException{
		if(num <=0)
			throw new EmptyIntQueueException();
		int x = que[front++];
		num--;
		
		if(front == max)
			front = 0;
		
		return x;		
	}
	
	//큐에서 데이터를 peek (프런트 데이터를 들여다 봄)
	public int peek() throws EmptyIntQueueException{
		if(num <= 0)
			throw new EmptyIntQueueException();
		return que[front];
	}
	
	//q에서 x를 검색하여 인덱스를 반환 (없으면 -1)
	public int indexOf(int x) {
		for(int i=0; i<num; i++) {
			int idx = (i + front) % max;
			if(que[idx] ==x)
				return idx;
		}
	return -1;
	}		
	
	//큐를 비움
	public void clear() {
		num = front = rear = 0;
	}
	
	//큐의 용량을 반환
	public int capacity() {
		return max;
	}
	
	//큐에 쌓여 있는 데이터 수를 반환
	public int size() {
		return num;
	};
	
	//큐가 비어있나?
	public boolean isEmpty() {
		return num <=0;
	}
	
	//큐가 가득 찾는가
	public boolean isFull() {
		return num>= max;
	}
	
	//큐 안의 모든 데이터를 프런트 -> 리어 순으로 출력
	
	public void dump() {
		if (num<=0)
			System.out.println("큐가 비어있습니다.");
		else {
			for(int i=0; i <num ; i++) 
				System.out.print(que[(i+front) % max] + " ");
			
			System.out.println();
						
		}
	}
	
	//큐 에서 x를 검색하여 머리부터 몇 번 째 인가(찾지 못하면0) 반환
	public int search(int x) {
		for(int i=0; i <num; i++)
			if(que[(i+front) % max] == x)
				return i+1;
		return 0;
	}
	
}
