package Lec16;

import java.util.Arrays;
import java.util.Scanner;

public class Aggresive_Cows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int c=sc.nextInt();
			int [] arr=new int [n];
			for(int i=0;i<arr.length;i++) {
				arr[i]=sc.nextInt();
			}
			System.out.println(solve(arr,c));
		}
	}

	private static int solve(int[] arr, int c) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		int lo=0;
		int hi=arr[arr.length-1]-arr[0];
		int ans=0;
		while(lo<=hi) {
			int mid=lo+(hi-lo)/2;
			if(isSafe(arr,c,mid)) {
				ans=mid;
				lo=mid+1;
			}
			else {
				hi=mid-1;
			}
		}
		return ans;
	}

	private static boolean isSafe(int[] arr, int cow, int d) {
		// TODO Auto-generated method stub
		int pos=arr[0];
		int c=1;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]-pos>=d) {
				c++;
				pos=arr[i];
			}
			if(c==cow) {
				return true;
			}
		}
		return false;
	}

}
