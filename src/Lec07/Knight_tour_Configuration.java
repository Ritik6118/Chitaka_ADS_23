package Lec07;

public class Knight_tour_Configuration {
	public boolean checkValidGrid(int[][] arr) {
		return chek(arr,0,0,0,(arr.length*arr[0].length)-1);
	}
	public boolean chek(int[][] arr,int row,int col,int count,int n){
		if(row<0 || col<0 || row>=arr.length || col>=arr[0].length){
			return false;
		}
		else if(count==n && arr[row][col]==count){
			// System.out.println(count);
			return true;
		}
		else if(arr[row][col]!=count){
			return false;
		}
		int [] r={1,1,-1,-1,2,2,-2,-2};
		int [] c={-2,2,2,-2,1,-1,1,-1};
		for(int i=0;i<r.length;i++){
			boolean ans=chek(arr,row+r[i],col+c[i],count+1,n);
			if(ans==true){
				return true;
			}
		}
		return false;
	}
}
