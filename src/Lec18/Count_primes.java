package Lec18;

public class Count_primes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int countPrimes(int n) {
        boolean[] arr=new boolean [n];
		for(int i=2;i<arr.length;i++) {
			arr[i]=true;
		}
		for(int i=0;i<Math.sqrt(n);i++) {
			if(arr[i]==true) {
				for(int j=i*i;j<arr.length;j+=i) {
                    arr[j]=false;
				}
			}
		}
        int c=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==true) {
				c++;
			}
		}
        return c;
    }

}
