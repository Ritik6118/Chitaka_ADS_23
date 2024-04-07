package Lec23_G25;

public class My_Stack_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		My_Stack st=new My_Stack();
		Dynamic_Stack st=new Dynamic_Stack();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		try {
			st.push(6);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(st.isEmpty());
		System.out.println(st.isFull());
		System.out.println(st.peek());
		System.out.println(st);
	}

}
