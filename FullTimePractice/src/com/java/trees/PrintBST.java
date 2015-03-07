package com.java.trees;

public class PrintBST {
	 
 public static void main(String[] args)
 {
	 /*  Create following Binary Tree
	    
	    1) Test case 1
	    
	         20
	      /  	 \
	     8    	  22
	    / \  	 
	   4   12 	       
	 */
	 
	   TreeNode root = new TreeNode(20);
		root.leftNode= new TreeNode(8);
		root.rightNode = new TreeNode(22);
		
		root.leftNode.leftNode= new TreeNode(3); //
		root.leftNode.rightNode = new TreeNode(5); 
		
		root.rightNode.leftNode = new TreeNode(2); //
		root.rightNode.rightNode =new TreeNode(2);
		
		root.leftNode.rightNode.rightNode = new TreeNode(5);//
		root.rightNode.leftNode.leftNode =new TreeNode(3);//
 }
	
	static void mPrintKeysInRange(int k1,int k2,TreeNode Node)
	{

		mPrintKeysInRange(k1, k2,Node.leftNode);
		if (Node.data >=k1 & Node.data<=k2)
			System.out.println(Node.data);
		mPrintKeysInRange(k1, k2, Node.rightNode);
		
	}
	
}	

