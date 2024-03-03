package Lec10;

public class max_sum_of_subarray_of_length_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [ ] arr= {9,9,9,4,5,1,2,2,6,7,9};
		System.out.println(max_sum(arr,3));
	}
	public static int max_sum(int[] arr,int k) {
		int ans=0;
		int sum=0;
		for(int i=0;i<k;i++) {
			sum+=arr[i];
		}
		ans=Math.max(ans, sum);
		for(int i=k;i<arr.length;i++) {
			sum+=arr[i];
			sum-=arr[i-k];
			ans=Math.max(ans, sum);
		}
		return ans;
	}

}
