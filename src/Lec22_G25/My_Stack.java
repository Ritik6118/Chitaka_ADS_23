package Lec22_G25;

public class My_Stack {
	private int [] arr;
	private int top;
	My_Stack (){
		this.arr=new int[5];
	}
	My_Stack (int n) {
		this.arr=new int[n];
	}
	public void push(int n) {
		if(this.isFull()) {
			int [] arr2=new int[2*arr.length];
			for(int i=0;i<top;i++) {
				arr2[i]=arr[i];
			}
			this.arr=arr2;
		}
		arr[top++]=n;
	}
	public int pop() {
		return arr[--top];
	}
	public int peek() {
		return arr[top-1];
	}
	public boolean isEmpty() {
		return top==0;
	}
	public boolean isFull() {
		return top==arr.length;
	}
	public int size() {
		return top;
	}
	
	@Override
	public String toString() {
		String s="[ ";
		for(int i=0;i<top;i++) {
			s+=arr[i]+" ";
		}
		s+="]";
		return s;
	}
	
}
