package Lec11;

public class Maximize_Confusion_inExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int maxConsecutiveAnswers(String s, int k) {
		int si=0;
		int ei=0;
		int ans=0;
		int flip=0;
		while(ei<s.length()){
			if(s.charAt(ei)=='F'){
				flip++;
			}
			while(flip>k && si<=ei){
				if(s.charAt(si)=='F'){
					flip--;
				}
				si++;
			}
			ans=Math.max(ans,ei-si+1);
			ei++;
		}
		ei=0;
		si=0;
		flip=0;
		while(ei<s.length()){
			if(s.charAt(ei)=='T'){
				flip++;
			}
			while(flip>k && ei<=ei){
				if(s.charAt(si)=='T'){
					flip--;
				}
				si++;
			}
			ans=Math.max(ans,ei-si+1);
			ei++;
		}
		return ans;
	}
}
