package Lec_22_G26;

public class My_Queue {
	private int[] arr;
	private int front;
	private int size;
	My_Queue (){
		this.arr=new int [10];
	}
	public void add(int n) {
		int idx=front+size;
		idx%=arr.length;
		arr[idx]=n;
		size++;
	}
	public int peek() {
		return arr[front];
	}
	public int poll() {
		int n=arr[front];
		front++;
		front%=arr.length;
		size--;
		return n;
	}
	public int size() {
		return size;
	}
	public boolean isFull() {
		return size==arr.length;
	}
	public boolean isEmpty() {
		return size==0;
	}
	@Override
	public String toString() {
		String s="";
		int index=front;
		int i=0;
		while(i<size) {
			s+= arr[index]+" ";
			index++;
			index%=arr.length;
			i++;
		}
		return s;
	}
}
