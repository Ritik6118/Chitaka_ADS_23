package Lec09;
import java.util.*;
public class N_Queens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	class Solution {
	    public static List<List<String>> solveNQueens(int n) {
			List<List<String>> ans=new ArrayList<>();
			List<String> li=new ArrayList<>();
			boolean[][] arr=new boolean[n][n];
			solve(arr,n,0,ans);
			return ans;
	    }
		private static void solve(boolean[][] arr, int n, int row, List<List<String>> ans) {
			// TODO Auto-generated method stub
			if(n==0) {
				ans.add(aslist(arr));
				return;
			}
			for(int col=0;col<arr[0].length;col++) {
				if(arr[row][col]==false && issafe(arr,row,col)==true) {
					arr[row][col]=true;
					solve(arr,n-1,row+1,ans);
					arr[row][col]=false;
				}
			}
		}
		private static List<String> aslist(boolean[][] arr) {
			// TODO Auto-generated method stub
			List<String> li=new ArrayList<>();
			for(int i=0;i<arr.length;i++) {
				String s="";
				for(int j=0;j<arr.length;j++) {
					if(arr[i][j]==true) {
						s+="Q";
					}
					else {
						s+=".";
					}
				}
				li.add(s);
			}
			return li;
		}
		private static boolean issafe(boolean[][] arr, int row, int col) {
			// TODO Auto-generated method stub
			int r=row;
			int c=col;
			while(r>=0) {
				if(arr[r][c]==true) {
					return false;
				}
				r--;
			}
			r=row;
			c=col;
			while(r>=0 && c>=0) {
				if(arr[r][c]==true) {
					return false;
				}
				r--;
				c--;
			}
			r=row;
			c=col;
			while(r>=0 && c<arr[0].length) {
				if(arr[r][c]==true) {
					return false;
				}
				r--;
				c++;
			}
			
			return true;
		}
	}
}
