package Lec_21_G26;

import java.util.Random;

public class Student {
	static int c;
	int rollNumber;
	String Name;
	int Knowledge;
	int Communication;
	int Confidence;
	int luck;
	Student(){
		c++;
	}
	Student(int r,String n,int k,int com,int conf){
		c++;
		rollNumber=r;
		Name=n;
		Knowledge=k;
		Communication=com;
		Confidence=conf;
	}
	public void introduction() {
		System.out.println("Hello i am "+Name+" and my roll number is "+rollNumber+" ");
	}
	public void study() {
		System.out.println(Name+"is Studying.... ");
		Knowledge+=10;
	}
	public void interview() {
		int elegiblity=300;
		Random rd=new Random();
		this.luck=rd.nextInt(-150, 150);
		if(luck<50) {
			System.out.println(Name+" was unlucky");
		}
		else if(luck>100) {
			System.out.println(Name+" was Lucky");
		}
		int sum=luck+Communication +Confidence+Knowledge;
		if(sum>elegiblity) {
			System.out.println(Name +" is Placed");
		}
		else {
			System.out.println(Name + " is Not Placed");
		}
		Knowledge+=10;
		Confidence+=10;
		Communication+=10;
	}
}

