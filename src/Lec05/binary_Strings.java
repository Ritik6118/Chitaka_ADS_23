package Lec05;

public class binary_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s="1??0?101";
		String s="101??010?";
		outcomes(s,"");
	}

	private static void outcomes(String s, String ans) {
		// TODO Auto-generated method stub
		if(s.length()==0) {
			System.out.println(ans);
			return;
		}
		if(s.charAt(0)=='?') {
			outcomes(s.substring(1),ans+'0');
			outcomes(s.substring(1),ans+'1');
		}
		else {
			outcomes(s.substring(1),ans+s.charAt(0));
		}
	}

}













//static class TreeNode {
//    String name;
//    boolean isLocked;
//    boolean hasLockedDescendant; // New field to track if the node or any descendant is locked
//    boolean hasLockedAncestor; // New field to track if the node or any ancestor is locked
//    TreeNode parent;
//    ArrayList<TreeNode> child = new ArrayList<>();
//
//    TreeNode(String name, TreeNode parent) {
//        this.name = name;
//        this.parent = parent;
//    }
//}
//
//static boolean lock(TreeNode node, int id) {
//    if (node.isLocked || node.hasLockedDescendant) return false; // If node or any descendant is locked, return false
//    if (node.hasLockedAncestor) return false; // If node or any ancestor is locked, return false
//    node.isLocked = true;
//    node.hasLockedDescendant = true; // Update hasLockedDescendant flag
//    updateAncestorLockStatus(node.parent, true); // Update hasLockedAncestor flag for ancestors
//    return true;
//}
//
//static void updateAncestorLockStatus(TreeNode node, boolean value) {
//    while (node != null) {
//        node.hasLockedAncestor = value; // Update hasLockedAncestor flag for ancestors
//        node = node.parent;
//    }
//}
