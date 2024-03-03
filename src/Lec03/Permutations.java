package Lec03;

import java.util.HashSet;

public class Permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abca";
//		permu(s,"");
		hpermu(s,"");
		
	}
	

	private static void hpermu(String s, String ans) {
		// TODO Auto-generated method stub
		if(s.length()==0) {
			System.out.println(ans);
			return;
		}
		HashSet<Character> set=new HashSet<>();
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(!set.contains(ch)) {
				set.add(ch);
//				arr[ch-'a']=true;
				String l=s.substring(0,i);
				String r=s.substring(i+1);
				permu(l+r,ans+ch);
			}
		}
	}


	private static void permu(String s, String ans) {
		
		// TODO Auto-generated method stub
		boolean[] arr=new boolean[26];
		
		if(s.length()==0) {
			System.out.println(ans);
			return;
		}
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(arr[ch-'a']==false) {
				arr[ch-'a']=true;
				String l=s.substring(0,i);
				String r=s.substring(i+1);
				permu(l+r,ans+ch);
			}
		}
		
	}

}
