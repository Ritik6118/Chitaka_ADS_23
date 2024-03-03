package Lec01;

import java.util.Arrays;

public class merge_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {9,6,4,2,1,2,4,5,6,7,4,8};
		arr=merge_sort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

	private static int[] merge_sort(int[] arr, int lo, int hi) {
		// TODO Auto-generated method stub
		if(lo==hi) {
			int [] ans=new int[1];
			ans[0]=arr[lo];
			return ans;
		}
		int mid=(lo+hi)/2;
		int[] arr1=merge_sort(arr,lo,mid);
		int[] arr2=merge_sort(arr,mid+1,hi);
		return merge(arr1,arr2);
		
	}

	private static int[] merge(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		int [] ans=new int[arr1.length+arr2.length];
		int idx=0;
		int i=0;
		int j=0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				ans[idx++]=arr1[i++];
				
			}
			else {
				ans[idx++]=arr2[j++];
			}
		}
		while(i<arr1.length) {
			ans[idx++]=arr1[i++];
		}
		while(j<arr2.length) {
			ans[idx++]=arr2[j++];
		}
		return ans;
	}

}
