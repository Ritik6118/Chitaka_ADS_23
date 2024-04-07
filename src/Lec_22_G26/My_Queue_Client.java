package Lec_22_G26;

public class My_Queue_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		My_Queue q=new My_Queue();
		q.add(1);
		q.add(2);
		q.add(3);
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
	}

}
