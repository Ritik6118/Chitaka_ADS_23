package lec25;

public class Path_Sum_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	class Solution {
	    List<List<Integer>> ans=new ArrayList<>();
	    List<Integer> li=new ArrayList<>();
	    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
	        hasPathSum(root,targetSum);
	        return ans;
	    }
	     public void hasPathSum(TreeNode root, int targetSum) {
	        if(root==null){
	            return ;
	        }
	        if(root.left==null && root.right==null && targetSum==root.val){
	            // targetSum-=root.val;
	            li.add(root.val);
	            ans.add(new ArrayList<>(li));
	            li.remove(li.size()-1);
	            return;
	            // return false;
	        }
	        // targetSum-=root.val;
	        li.add(root.val);
	        hasPathSum(root.left,targetSum-root.val);
	        hasPathSum(root.right,targetSum-root.val);
	        li.remove(li.size()-1);
	    }
	}
}
