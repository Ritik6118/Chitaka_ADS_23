package Lec04;

public class lexico_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		count(n,0);
	}

	private static void count(int n, int ans) {
		// TODO Auto-generated method stub
		if(ans>n) {
			return;
		}
		System.out.println(ans);
		int i=0;
		if(ans==0) {
			i=1;
		}
		for(;i<=9;i++) {
			count(n,(ans*10)+i);
		}
	}

}
