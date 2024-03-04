package Lec15;
import java.util.*;

public class Get_The_Maximum_Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int maxSum(int[] arr1, int[] arr2) {
        int i=0;
        int j=0;
        long si=0;
        long sj=0;
        int mod=1000000007;
        long ans=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                si+=arr1[i];
                i++;
            }
            else if(arr2[j]<arr1[i]){
                sj+=arr2[j];
                j++;
            }
            else {
                ans+=Math.max(si,sj);
                ans+=arr1[i];
                si=0;
                sj=0;
                i++;
                j++;
            }
        }
        while(i<arr1.length){
            si+=arr1[i];
            i++;
        }
        while(j<arr2.length){
            sj+=arr2[j];
            j++;
        }
        ans+=Math.max(si,sj);
        return(int)(ans%mod);
    }

}
