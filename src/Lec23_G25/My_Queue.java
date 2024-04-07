package Lec23_G25;

public class My_Queue {
	private int [] arr;
	private int front;
	private int size;
	public int poll() {
		int n=arr[front];
		front++;
		front%=arr.length;
		size--;
		return n;
	}
	public int peek() {
		return arr[front];
	}
	public void add(int n) {
		int idx=front+size;
		idx%=arr.length;
		arr[idx]=n;
		size++;
	}
	public boolean isEmpty() {
		return size==0;
	}
	public boolean isFull() {
		return size==arr.length;
	}
	public int size() {
		return size;
	}
}
