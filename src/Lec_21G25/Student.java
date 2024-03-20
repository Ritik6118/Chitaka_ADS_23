package Lec_21G25;

public class Student {
	String Name;
	int rollNumber;
	int knowledge;
	
	public void introduce() {
		System.out.println("hi my name is "+ Name +" and my roll number is "+ rollNumber +" ");
	}
	public void study() {
		System.out.println(Name+" is Studying.......");
		knowledge+=20;
	}
	public void teaches(Student s) {
		System.out.println(this.Name + " is teaching "+s.Name);
		this.knowledge+=10;
		s.knowledge+=10;
	}
}
