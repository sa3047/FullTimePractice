package com.java.trees;

import java.util.LinkedList;
import java.util.Queue;

//@Auther : Swapnil Aher
//@Date : 3/4/2015
// Purpose : level order tree traversal / Bfs on tree 
// recursive solution
public class Bfs {

	public static void main(String args[])
	{
		/*  Create following Binary Tree
		1) Test case 1
	        1
	      /   \
	     2     3
	    / \   / \
	   5   4 6  7
	   
	   2) Test case 2
	         1
	      /  	 \
	     2    	 3
	    / \  	 / \
	   4   5 	6  7
	       \   		\     
	        8  		 9 
	        
	    3) Test case 3
	    
	         1
	      /  	 \
	     2    	 3
	    / \  	 / \
	   4   5 	6  7
	       \   /     
	        8  9  
	                        
	        */
			
			TreeNode root = new TreeNode(1);
			root.leftNode= new TreeNode(2);
			root.rightNode = new TreeNode(3);
			
			root.leftNode.leftNode= new TreeNode(4); //
			root.leftNode.rightNode = new TreeNode(5); 
			root.rightNode.leftNode = new TreeNode(6); //
			root.rightNode.rightNode =new TreeNode(7);
			
			root.leftNode.rightNode.rightNode = new TreeNode(8);//
			root.rightNode.leftNode.leftNode =new TreeNode(9);//
			
			Queue<TreeNode> NodeList = new LinkedList<TreeNode>();
			NodeList.add(root);
			
			mPrintBfs(NodeList);
	}
	
	
	// check queue is empty or not
	// take out node from queue print it then 
	// if they are not null mark it put its left and right node into queue
	
	static void mPrintBfs(Queue<TreeNode> NodeList )
	{
		TreeNode tempRef;
		if(NodeList.peek() == null)
			return;
		else
		{
			tempRef=NodeList.remove();
			System.out.print(tempRef.data);
			if(tempRef.leftNode!= null)
			NodeList.add(tempRef.leftNode);
			if(tempRef.rightNode!= null)
			NodeList.add(tempRef.rightNode);
			
			//recursive call to bfs function
			mPrintBfs(NodeList);
		}
		
	}
}


