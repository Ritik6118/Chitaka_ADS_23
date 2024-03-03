package Lec06;
import java.util.*;
public class Combination_sum_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	List<List<Integer>> ans=new ArrayList<>();
	public List<List<Integer>> combinationSum(int[] arr, int t) {
		generate(arr,0,t,0,new ArrayList<Integer>());
		return ans;
	}
	public void generate(int [] arr,int idx, int t,int sum, ArrayList<Integer> li){
		if(t==0){
			ans.add(new ArrayList<>(li));
			// System.out.println(li);
			return;
		}
		for(int i=idx;i<arr.length;i++){
			if(t>=arr[i]){
				li.add(arr[i]);
				generate(arr,i,t-arr[i],sum,li);
				li.remove(li.size()-1);
				
			}
		}
	}
	

}
