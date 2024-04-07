package Lec23_G17;

public class My_Queue {
	private int [] arr;
	private int front;
	private int size;
	public void add(int n) {
		int idx=size+front;
		idx%=arr.length;
		arr[idx]=n;
		size++;
	}
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
	public int size() {
		return size;
	}
	public boolean isFull() {
		return size==arr.length;
	}
	public boolean isEmptY() {
		return size==0;
	}
}


