package com.java.trees;

public class BalancesBinaryTree {

	public static void main(String[] args)
	{
		 /*  Create following Binary Tree
        
	    1) Test case 1
	    
	         12
	      /  	 \
	     8    	  4
	    / \  	 / \
	   3   5 	2   2
	       \    /
	        5   3           
	 */
			
		TreeNode root = new TreeNode(12);
			root.leftNode= new TreeNode(8);
			root.rightNode = new TreeNode(4);
			
			root.leftNode.leftNode= new TreeNode(3); //
			root.leftNode.rightNode = new TreeNode(5); 
			
			root.rightNode.leftNode = new TreeNode(2); //
			root.rightNode.rightNode =new TreeNode(2);
			
			root.leftNode.rightNode.rightNode = new TreeNode(5);//
			root.rightNode.leftNode.leftNode =new TreeNode(3);//
			
			isTreeBalanced(root);
			
	}
	
	static boolean isTreeBalanced(TreeNode node)
	{
		
		//leaf node
		if(node == null )
		{
			return true;
		}
		// traverse the tree using any
		// tree traversal algorithm
		
		int lTreeHeight = height(node.leftNode);
		int rTreeHeight = height(node.rightNode);
		
		if(Math.abs(lTreeHeight-rTreeHeight) > 2 
				& isTreeBalanced(node.leftNode)
				& isTreeBalanced(node.rightNode))
		{
			return true;
		}
		
		
			return false;

	}
	
	static int height(TreeNode node)
	{
		// this is leaf node
		if(node == null)
		{
			return 0;
		}
		else
		{
			return Math.max(height(node.leftNode),  height(node.rightNode)) + 1;
	
		}
		
		
	}
}


