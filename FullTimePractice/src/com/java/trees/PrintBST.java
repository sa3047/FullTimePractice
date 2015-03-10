package com.java.trees;
/*
 * @author: Swapnil Aher
 * @date: 3/7/2015
 * @purpose: Print BST keys in the given range k1 and k2
 * */
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
		
		root.leftNode.leftNode= new TreeNode(4); //
		root.leftNode.rightNode = new TreeNode(12); 
		
		/*	
	  	root.rightNode.leftNode = new TreeNode(2); //
		root.rightNode.rightNode =new TreeNode(2);
		
		root.leftNode.rightNode.rightNode = new TreeNode(5);//
		root.rightNode.leftNode.leftNode =new TreeNode(3);//
	 */ 
		mPrintKeysInRange(10, 22, root);
 }
	
	static void mPrintKeysInRange(int k1,int k2,TreeNode node)
	{
		
		if(node.leftNode!=null)
		mPrintKeysInRange(k1, k2,node.leftNode);
		
		if (node.data >=k1 & node.data<=k2 & node!=null)
			System.out.println(node.data);
		
		if(node.rightNode!=null)
		mPrintKeysInRange(k1, k2, node.rightNode);
		
	}
	
}	

