package tree;

public class TreeNodeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		TreeNode tree = new TreeNode(10);
//		
//		tree.left = new TreeNode(11);
//		tree.right = new TreeNode(12);
//		
//		tree.left.left = new TreeNode(13);
//		tree.left.right = new TreeNode(14);
//
//		tree.right.left = new TreeNode(15);
//		tree.right.right = new TreeNode(16);

//		TreeFunctions.preorder(tree);
		
//		TreeFunctions.inorder(tree);
		
		TreeNode root = null;
		root =  TreeFunctions.insertBST(root, 10);
		root =  TreeFunctions.insertBST(root, 11);
		root =  TreeFunctions.insertBST(root, 12);
		root =  TreeFunctions.insertBST(root, 13);
		root =  TreeFunctions.insertBST(root, 14);
		root =  TreeFunctions.insertBST(root, 15);
		root =  TreeFunctions.insertBST(root, 16);
		
		TreeFunctions.preorder(root);
		
	}

}
