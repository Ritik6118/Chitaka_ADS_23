package Lec_22_G26;

public class Dynamic_Stack extends My_Stack {
	@Override
//	int [] arr;   //this keyword
	
	public void push(int n) {
		if(super.isFull()) {
			int [] arr2=new int[super.arr.length*2];
			for(int i=0;i<super.arr.length;i++) {
				arr2[i]=arr[i];
			}
			super.arr=arr2;
		}
		arr[top++]=n;
	}
}
