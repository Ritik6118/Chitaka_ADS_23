/**
 * 
 */
package lec25;

/**
 * 
 */
public class Sum_root_to_leaf_numbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	class Solution {
	    public int sumNumbers(TreeNode root) {
	        return sum(root,0);
	    }
	    public int sum(TreeNode root,int digit){
	        if(root==null){
	            return 0;
	        }
	        if(root.left==null && root.right==null){
	            return (digit*10)+root.val;
	        }
	        int l=sum(root.left,(digit*10)+root.val);
	        int r=sum(root.right,(digit*10)+root.val);
	        return l+r;
	    }
	}


}
