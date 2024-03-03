package Lec08;
import java.util.*;

public class Word_Search {

	public boolean exist(char[][] arr, String s) {
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				if(arr[i][j]==s.charAt(0)){
					boolean ans=search(arr, s, i, j);
					if(ans==true){
						return true;
					}
				}
			}
		}
		return false;
	}
	public boolean search(char[][] arr, String s, int row, int col){
		if(s.length()==0){
			return true;   
		}
		if(row<0||col<0||row>=arr.length||col>=arr[0].length){
			return false;
		}
		if(s.charAt(0)!=arr[row][col]){
			return false;
		}
		int[] r={-1,1,0,0};
		int[] c={0,0,-1,1};
		for(int i=0;i<r.length;i++){
			arr[row][col]='1';
			boolean ans=search(arr,s.substring(1),row+r[i],col+c[i]);
			arr[row][col]=s.charAt(0);
			if(ans==true){
				return true;
			}
		}
		return false;
	}
	

}
