package lec25;

public class Path_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	class Solution {
	    public boolean hasPathSum(TreeNode root, int targetSum) {
	        if(root==null){
	            return false;
	        }
	        if(root.left==null && root.right==null){
	            targetSum-=root.val;
	            if(targetSum==0){
	                return true;
	            }
	            return false;
	        }
	        // targetSum-=root.val;
	        return hasPathSum(root.left,targetSum-root.val)||hasPathSum(root.right,targetSum-root.val);
	    }
	}

}
