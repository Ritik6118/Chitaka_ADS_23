package Lec12;
import java.util.*;
public class Maximum_in_Sliding_Window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int[] maxSlidingWindow(int[] arr, int k) {
        int[] ans=new int[arr.length-k+1];
        int idx=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>(new Comparator<Integer>(){
            @Override
            public int compare(Integer a,Integer b){
                return arr[b]-arr[a];
            }
        });
        for(int i=0;i<arr.length;i++){
            pq.add(i);
            while(!pq.isEmpty() && pq.peek()<=i-k){
                pq.poll();
            }
            if(i>=k-1){
                ans[idx++]=arr[pq.peek()];
            }
        }
        return ans;
    }
}
