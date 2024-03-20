package Lec22_G26;

public class My_Stack {
	protected int [] arr;
	protected int top;
	My_Stack(){
		this.arr=new int[5];
	}
	My_Stack(int n){
		this.arr=new int[n];
	}
	public void push(int n) throws Exception {
		if(this.isFull()) {
			throw new Exception("Stack is Full");  
		}
		arr[top++]=n;
		
	}
	public int pop() throws Exception {
		if(this.isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		return arr[--top];
	}
	public int peek() throws Exception {
		if(this.isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		return arr[top-1];
	}
	public boolean isFull() {
		return top==arr.length;
	}
	public boolean isEmpty() {
		return top==0;
	}
	public int size() {
		return top;
	}
}
