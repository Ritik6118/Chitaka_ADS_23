package Lec22_G25;

public class My_Stack_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		My_Stack st=new My_Stack();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		st.push(6);
		System.out.println(st.isEmpty());
		System.out.println(st.isFull());
		System.out.println(st.peek());
		System.out.println(st);
	}

}
