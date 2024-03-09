package Lec18;

public class Maximum_Subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int maxSubArray(int[] arr) {
        int ans=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            ans=Math.max(sum,ans);
            if(sum<=0){
                sum=0;
            }
        }
        return ans;
    }

}
