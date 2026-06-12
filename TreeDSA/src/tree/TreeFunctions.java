package tree;

public class TreeFunctions {

/*			
 			10
		
	11				12

13		14		15		16
*/
	public static void preorder(TreeNode root) {
		//root -> left ->left ->right
		//10 11 13 14 12 15 16 
		if(root == null) {
			return;
		}
		
		System.out.print(root.data+ " " );

		preorder(root.left);
		preorder(root.right);
	}
	
	public static void inorder(TreeNode root) {
		//left -> root -> right
		//13 11 14 10 15 12 16 
		
		if(root == null) {
			return;
		}
		
		inorder(root.left);
		System.out.print(root.data+ " ");
		inorder(root.right);
		
	}
	
	public static void Postorder(TreeNode root) {
		//left -> right -> root
		//
		
		if(root == null) {
			return;
		}
		
		Postorder(root.left);
		Postorder(root.right);
		System.out.println(root.data+ " ");
	}
	
	public static TreeNode insertBST(TreeNode root,int value) {
		if(root == null) {
			return new TreeNode(value);
		}
		
		if(value < root.data) {
			root.left =insertBST(root.left, value);
		}
		else {
			root.right = insertBST(root.right, value);
		}
		
		return root;
	}
}
