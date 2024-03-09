package Lec18;

public class Maximum_sum_circular_subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int maxSubarraySumCircular(int[] arr) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        int total=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            total+=arr[i];
            max=Math.max(sum,max);
            if(sum<=0){
                sum=0;
            }
        }
        int min=Integer.MAX_VALUE;
        sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            min=Math.min(min,sum);
            if(sum>0){
                sum=0;
            }
        }
        if(total==min){
            return max;
        }
        return Math.max(max,total-min);
    }

}
