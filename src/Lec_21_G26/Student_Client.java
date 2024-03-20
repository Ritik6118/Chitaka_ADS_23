package Lec_21_G26;

public class Student_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student(5,"abcd",50,50,50);
		Student s2=new Student(10,"efgh",50,50,50);
		System.out.println(s2.c);
		s.introduction();
		s2.introduction();
		System.out.println(s.Knowledge);
		s.study();
		System.out.println(s.Knowledge);
		s.interview();
		s.interview();
		s.interview();
		s.interview();
	}
	static {
		System.out.println("this is static block");
	}
	static {
		System.out.println("this is static block 2");
	}

}
