package Lec13;
import java.util.*;
public class Find_Polygon_with_largest_parimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,23,4,1,23,1,3,13,1}; 
		Arrays.sort(arr);
	        long ans=-1;
	        long sum=0;
	        for(int i=0;i<arr.length;i++){
	            if(i>=2){
	                if(sum>arr[i]){
	                    ans=sum+arr[i];
	                }
	            }
	            sum+=arr[i];
	        }
//	        return ans;
	}
	
}
