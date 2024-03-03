package Lec08;
import java.util.*;

public class Sudoku_Solver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	class Solution {
	    public void solveSudoku(char[][] board) {
	        solve(board,0,0);
	    }
	    public boolean solve(char[][] arr, int  row, int col){
	        if(col==9){
	            row++;
	            col=0;
	        }
	        if(row==9){
	            return true;
	        }
	        if(arr[row][col]=='.'){
	            for(int i=1;i<=9;i++){
	                if(isSafe(arr,row,col,i)){
	                    arr[row][col]=(char)(i+'0');
	                    boolean ans= solve(arr,row,col+1);
	                    if(ans){
	                        return true;
	                    }
	                    arr[row][col]='.';
	                }
	            }
	        }
	        else{
	            boolean ans=solve(arr,row,col+1);
	            if(ans){
	                return true;
	            }
	        }
	        return false;
	    }
	    public boolean isSafe(char[][] arr,int row,int col,int val){
	        for (int r = 0; r < arr.length; r++) {
				if(arr[r][col]==val+'0') {
					return false;
				}
			}
			for (int c = 0; c < arr.length; c++) {
				if(arr[row][c]==val+'0') {
					return false;
				}
			}
			int r=(row/3)*3;
			int c=(col/3)*3;
			for (int i = r; i < r+3; i++) {
				for (int j = c; j < c+3; j++) {
					if(arr[i][j]==val+'0') {
						return false;
					}
				}
			}
			return true;
	    }
	}
}
