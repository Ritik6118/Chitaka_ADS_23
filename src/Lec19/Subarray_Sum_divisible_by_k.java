package Lec19;

public class Subarray_Sum_divisible_by_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int subarraysDivByK(int[] arr, int k) {
        int rem=0;
        int sum=0;
        int ans=0;
        int[] freq=new int[k];
        // HashMap<Integer,Integer> map=new HashMap<>();
        // map.put(0,1);
        freq[0]=1;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            rem=sum%k;
            if(rem<0){
                rem+=k;
            }
            if(freq[rem]>0){
                ans+=freq[rem];
                freq[rem]++;
            }
            else{
                freq[rem]++;
            }
            // if(map.containsKey(rem)){
            //     ans+=map.get(rem);
            //     map.put(rem,map.get(rem)+1);
            // }
            // else{
            //     map.put(rem,1);
            // }
        }
        return ans;
    }

}
