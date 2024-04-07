package Lec23_G25;

public class Dynamic_Stack extends My_Stack{
//	int [] arr;
//	@Override
//	public void push2(int n,int [] arr) {
//		this.arr //Dynamic_Stack class ke data member array ke liye
//		arr // function wale array ake liye
//		super.arr // parent class ke data member array ke liye
//	}
	
	@Override
	public void push(int n) {
		if(super.isFull()) {
			int [] arr2=new int [super.arr.length*2];
			for(int i=0;i<super.arr.length;i++) {
				arr2[i]=arr[i];
			}
			super.arr=arr2;
		}
		arr[top++]=n;
	}
}
