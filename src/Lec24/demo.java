package Lec24;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=CreateTree();
//		display(root);
		levelorder(root);
//		preorder(root);
//		inorder(root);
//		postorder(root);
	}
	private static void postorder(TreeNode root) {
		// TODO Auto-generated method stub
		if(root==null) {
			return;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.val+" ");
	}
	private static void inorder(TreeNode root) {
		// TODO Auto-generated method stub
		if(root==null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.val+" ");
		inorder(root.right);
	}
	private static void preorder(TreeNode root) {
		// TODO Auto-generated method stub
		if(root==null) {
			return;
		}
		System.out.print(root.val+" ");
		preorder(root.left);
		preorder(root.right);
	}
	private static void levelorder(TreeNode root) {
		// TODO Auto-generated method stub
		Queue<TreeNode> q=new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			int x=q.size();
			while(x-->0) {
				TreeNode n=q.poll();
				if(n.left!=null) {
					q.add(n.left);
				}
				if(n.right!=null) {
					q.add(n.right);
				}
				System.out.print(n.val+" ");				
			}
			System.out.println();
		}
		System.out.println();
	}
	private static void display(TreeNode root) {
		// TODO Auto-generated method stub
		if(root==null) {
			return;
		}
		String s="";
		if(root.left==null) {
			s+=". <--";
		}
		else {
			s+=root.left.val+"<--";
		}
		s+=root.val;
		if(root.right==null) {
			s+="--> .";
		}
		else {
			s+="-->"+root.right.val;
		}
		System.out.println(s);
		display(root.left);
		display(root.right);
	}
	static Scanner sc=new Scanner(System.in);
	private static TreeNode CreateTree() {
		// TODO Auto-generated method stub
		TreeNode nn=new TreeNode(sc.nextInt()); 
		boolean hlc=sc.nextBoolean();
		if(hlc==true) {
			nn.left=CreateTree();
		}
		boolean hrc=sc.nextBoolean();
		if(hrc==true) {
			nn.right=CreateTree();
		}
		return nn;
	}
	

}
//						10

//				5				5

//			2				2

//		11		12				11
//10 true 5 true 2 true 11 false false true 12 false false false true 5 true 2 false true 11 false false false
class TreeNode{
	int val;
	TreeNode right;
	TreeNode left;
	TreeNode(int n){
		this.val=n;
	}
	TreeNode() {
		
	}
}
//						5

//			4						4

//		3		3				3		3

//	2	   2 2   	2		2	   2 2  	2	

//5 true 4 true 3 true 2 false false true 2 false false true 3 true 2 false false true 2 false false true 4 true 3 true 2 false false true 2 false false true 3 true 2 false false true 2 false false
