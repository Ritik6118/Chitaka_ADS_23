package Lec10;

public class Longest_Substring_without_repeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int lengthOfLongestSubstring(String s) {
        int si=0;
        int ei=0;
        int[] freq=new int[256];
        int ans=0;
        while(ei<s.length()){
            freq[s.charAt(ei)]++;
            while(freq[s.charAt(ei)]>1 && si<=ei){
                freq[s.charAt(si)]--;
                si++;
            }
            ans=Math.max(ans,ei-si+1);
            ei++;
        }
        return ans;
    }
}
