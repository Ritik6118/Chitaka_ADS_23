package Lec14;

public class find_difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public char findTheDifference(String s, String t) {
        char[] arr1=s.toCharArray();
        char[] arr2=t.toCharArray();
        int [] freq=new int[26];
        for(int i=0;i<arr1.length;i++){
            freq[arr1[i]-'a']++;
        }
        for(int i=0;i<arr2.length;i++){
            freq[arr2[i]-'a']--;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0){
                return (char)(i+'a');
            }
        }
        return 'z';
    }

}
