package Lec_21G25;

public class Student_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.Name="abcd";
		s.rollNumber=1234;
		s.knowledge=50;
		s.introduce();
		System.out.println("Knowledge before studying " +s.knowledge);
		s.study();
		System.out.println("Knowledge after studying " +s.knowledge);
		Student s2=new Student();
		s2.Name="efgh";
		s2.rollNumber=5678;
		s2.knowledge=40;
		System.out.println(s.knowledge+" "+s2.knowledge);
		s.teaches(s2);
		s2.teaches(s);
		System.out.println(s.knowledge+" "+s2.knowledge);
	}

}
