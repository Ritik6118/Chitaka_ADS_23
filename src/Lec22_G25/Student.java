package Lec22_G25;

public class Student {
	static int i=0;
	String Name;
	int rollNumber;
	int knowledge;
	Student(){
		i++;
	}
	Student(String Name, int rollNumber,int knowledge){
		this.Name=Name;
		this.rollNumber=rollNumber;
		this.knowledge=knowledge;
	}
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
