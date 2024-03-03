package Lec03;

public class cointToss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		toss(n,"");
	}

	private static void toss(int n, String ans) {
		// TODO Auto-generated method stub
		if(n==0) {
			System.out.println(ans);
			return;
		
		}
		if(ans.length()==0 || ans.charAt(ans.length()-1)=='T') {
			toss(n-1,ans+"H");			
		}
		if(ans.length()==0 || ans.charAt(ans.length()-1)=='H') {			
			toss(n-1,ans+"T");
		}
		
	}

}
