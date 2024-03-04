package Lec15;
import java.util.*;
public class Three_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<List<Integer>> threeSum(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(i>0 && arr[i]==arr[i-1]){
                continue;
            }
            int j=i+1;
            int k=arr.length-1;
            while(j<k){
                int sum=arr[i]+arr[j]+arr[k];
                if(sum==0){
                    List<Integer> li=new ArrayList<>();
                    li.add(arr[i]);
                    li.add(arr[j]);
                    li.add(arr[k]);
                    ans.add(li);
                    j++;
                    k--;
                    while(j<k && arr[j]==arr[j-1]){
                        j++;
                    }
                    while(j<k && arr[k]==arr[k+1]){
                        k--;
                    }
                }
                else if(sum<0){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return ans;
    }

}
