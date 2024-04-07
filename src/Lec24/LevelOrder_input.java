package Lec24;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LevelOrder_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Queue<TreeNode> q=new LinkedList<>();
		int n=sc.nextInt();
		if(n>=0) {
			q.add(new TreeNode(n));
		}
		TreeNode root=q.peek();
		while(!q.isEmpty()) {
			TreeNode tn=q.poll();
			int a=sc.nextInt();
			if(a!=-1) {
				tn.left=new TreeNode(a);
				q.add(tn.left);
			}
			int b=sc.nextInt();
			if(b!=-1) {
				tn.right=new TreeNode(b);
				q.add(tn.right);
			}
		}
		display(root);
	}

	private static void display(TreeNode root) {
		// TODO Auto-generated method stub
		Queue<TreeNode>q=new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			TreeNode n=q.poll();
			if(n.left!=null) {
				q.add(n.left);
			}
			if(n.right!=null) {
				q.add(n.right);
			}
			System.out.println(n.val);
		}
	}

	static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int n){
			val=n;
		}
	}
}
//5 4 4 3 -1 3 3 -1 -1 2 -1 -1 -1 -1 -1
