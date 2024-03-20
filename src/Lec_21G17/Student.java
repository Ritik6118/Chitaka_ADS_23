package Lec_21G17;

import java.util.Random;

public class Student {
	String Name;
	int rollNumber;
	int Knowledge;
	int Confidence;
	int Luck;
	int Communication;
	boolean isPlaced;
	
	Student(String n,int r,int k,int conf,int comm){
		this.Name=n;
		this. rollNumber=r;
		this. Knowledge=k;
		this. Confidence=conf;
		this. Communication=comm;
	}
	
	public void introduce() {
		System.out.println("Hello my name is "+Name+" ans my roll number is "+rollNumber);
	}
	public void study() {
		System.out.println(this.Name+" is Studying... ");
		this.Knowledge+=10;
	}
	public void communicate() {
		this.Communication+=10;
	}
	public void interview() {
		int eleg=350;
		Random rd=new Random();
		this.Luck=rd.nextInt(-100, 150);
		if(Luck>100) {
			System.out.println(this.Name+" was lucky");
		}
		else if(Luck<50){
			System.out.println(this.Name+" was Unlucky");
		}
		int sum=Communication+Knowledge+Luck+Confidence;
		if(!isPlaced && sum<eleg) {
			System.out.println("interview failed");
		}
		else {
			System.out.println(this.Name+" is placed");
			isPlaced=true;
		}
		Communication+=5;
		Knowledge+=5;
		Confidence+=10;
	}
}
