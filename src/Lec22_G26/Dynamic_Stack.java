package Lec22_G26;

public class Dynamic_Stack extends My_Stack {
	@Override
	public void push(int n) {
		if(this.isFull()) {
			int [] arr2=new int[super.arr.length*2];
			for(int i=0;i<top;i++) {
				arr2[i]=super.arr[i];
			}
			super.arr=arr2;
		}
		arr[top++]=n;
	}

}
