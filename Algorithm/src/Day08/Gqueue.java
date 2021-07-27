package Day08;
//임의의 객체형 데이터를 쌓아 놓을 수 있는 제네릭 큐 클래스 Gqueue<E>를 작성
//블로그에 7월 14일 글 에서 Day08.zip을 활용해서 작성해보세요.
//
public class Gqueue<E> {
	//실행 할 때 예외 : 큐가 비어 있음.
	public static class EmptyGqueueException extends RuntimeException{
		public EmptyGqueueException() {}
	}
	
	//실행 할 때 예외 : 큐가 가득 참
	public static class OverflowGqueueException extends RuntimeException{
		public OverflowGqueueException() {}
	}
	
	private int max;
	private int num;
	private int front;
	private int rear;
	private E [] que;
	
	//생성자
	public Gqueue(int capacity){
		num = front = rear = 0;
		max = capacity;
		try {
			que = (E[])new Object[max];			
		}catch(OutOfMemoryError e) {
			max = 0;
		}
	}
	//인큐
	public E enque(E x) throws OverflowGqueueException{
		if (num >= max)
			throw new OverflowGqueueException();
		que[rear++] = x;
		num++;
		if(rear == max)
			rear = 0;
		return x;
	}
	
	//디큐
	public E deque() throws EmptyGqueueException{
		if(num <=0)
			throw new EmptyGqueueException();
		E x = que[front++];
		num--;
		if(front == max)
			front = 0;
		return x;
	}
	//피크 머리의 데이터를 살펴봄
	public E peek() throws EmptyGqueueException{
		if (num <=0)
			throw new EmptyGqueueException();
		return que[front];
	}
	//index 검색
	public int indexOf(E x) {
		for(int i=0; i <num ; i++) {
			if(que[(i+front) % max] == x)
				return i + front;			
		}
		return -1;
	}
	//search
	public int search(E x) {
		for(int i =0 ;i < num; i++)
			if(que[(i+front) % max].equals(x))
				return i+1;
		return -1;
	}
	//큐를 비움 clear
	public void clear() {
		num = front = rear = 0;
	}
	//용량 capacity
	public int capacity() {
		return max;
	}
	//데이터 수를 반환  size
	public int size() {
		return num;
	}
	//큐가 비어 있나? isEmpty
	public boolean isEmpty() {
		return num <=0;
	}
	//큐가 가득 찼나? isFull
	public boolean isFull() {
		return num >= max;
	}
	//큐 안의 데이터를 머리->꼬리의 차례로 나타냄 dump
	public void dump() {
		if(num <=0)
			System.out.println("큐가 비었습니다.");
		else {
			for(int i=0 ; i<num ; i++)
				System.out.println(que[(i+front)%max].toString()+ " ");
			System.out.println();
		}
	}
	
}
