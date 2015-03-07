package com.java.trees;

import java.util.Stack;

/*@author: Swapnil Aher
 *@date: 3/6/2015
 *@purpose: Inorder Traversal using stack with recursion
 *@Algorithm:
 *1) 
 */
public class InorderTraversalWithoutRecursion {

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
			
	}
	void inorderTraversal(TreeNode node)
	{
		TreeNode current = null;
		Stack<TreeNode> st = new Stack<TreeNode>();
		current = node;
		
		search:
		while(true)
		{
			if (current.leftNode!= null & !st.isEmpty())
			{
				//push it on stack
				st.push(current);
				current = current.leftNode;
			}
			else if(current == null & !st.isEmpty())
			{
				System.out.println(st.pop().data);
				current = current.rightNode;
				break search;
			}
			
		}
	}
}
