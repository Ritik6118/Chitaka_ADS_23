package Lec06;
import java.util.*;
public class Combination_Sum_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	List<List<Integer>> ans=new ArrayList<>();
	public List<List<Integer>> combinationSum2(int[] arr, int t) {
		Arrays.sort(arr);
		generate(arr,0,t,new ArrayList<Integer>());
		return ans;
	}
	public void generate (int[] arr,int idx,int t,List<Integer> li){
		if(t==0){
			ans.add(new ArrayList<>(li));
			return ;
		}
		// HashSet<Integer> set=new HashSet<>();
		for(int i=idx;i<arr.length;i++){
			// if(!set.contains(arr[i])){
			// set.add(arr[i]);
			if(i==idx || arr[i]!=arr[i-1]){
				if(t>=arr[i]){
					li.add(arr[i]);
					generate(arr,i+1,t-arr[i],li);
					li.remove(li.size()-1);
				}
			}
			// }
		}
	}

}
