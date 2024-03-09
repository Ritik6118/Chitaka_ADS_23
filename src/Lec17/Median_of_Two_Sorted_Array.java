package Lec17;

public class Median_of_Two_Sorted_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        if(arr1.length>arr2.length){
            return findMedianSortedArrays(arr2,arr1);
        }
        int lo=0;
        int hi=arr1.length;
        int te=arr1.length+arr2.length;
        while(lo<=hi){
            int arr1left=lo+(hi-lo)/2;
            int arr2left=((te+1)/2)-arr1left;
            int a1lm1= (arr1left==0) ? Integer.MIN_VALUE : arr1[arr1left-1];
            int a1l= (arr1left==arr1.length) ? Integer.MAX_VALUE :arr1[arr1left];
            int a2lm1= (arr2left==0) ? Integer.MIN_VALUE : arr2[arr2left-1];
            int a2l= (arr2left==arr2.length) ? Integer.MAX_VALUE :arr2[arr2left];
            double median=0.0;
            if(a1lm1<=a2l && a2lm1<=a1l){
                if(te%2==0){
                    int lmax=Math.max(a1lm1,a2lm1);
                    int rmin=Math.min(a1l,a2l);
                    median=(lmax+rmin)/2.0;
                }
                else{
                    int lmax=Math.max(a1lm1,a2lm1);
                    median=lmax;
                }
                return median;
            }
            else if(a1lm1>a2l){
                hi=arr1left-1;
            }
            else if(a2lm1>a1l){
                lo=arr1left+1;
            }
        }
        return 0.0;
    }

}
