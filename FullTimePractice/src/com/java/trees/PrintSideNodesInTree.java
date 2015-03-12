package com.java.trees;
/*
 *@author: Swapnil Aher
 *@date: 3/11/2015
 *@purpose: To print the elements which are along the side of the tree 
 * */
public class PrintSideNodesInTree {

	//root reference for backtracking
	static Node statRefRoot = null;
	static boolean left = false;
	static boolean right = false;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*  Create following Binary Tree
        
		    1) Test case 1
		    
			         12
			      /  	 \
			     8    	  4
			    / \  	 / \
			   3   5 	2   2
			  /    \   /     \
			 2      5 3       6
			 
		 2) Test case 2     
		             12
			      /  	 \
			     8    	  4
			    / \  	 / \
			   3   5 	2   2
			       \         \
			        5         6
		     
		 */
			
			Node root = new Node(12);
			root.leftNode= new Node(8);
			root.rightNode = new Node(4);
			
			root.leftNode.leftNode= new Node(3); //
			root.leftNode.rightNode = new Node(5); 
			
			root.rightNode.leftNode = new Node(2); //
			root.rightNode.rightNode =new Node(2);
			
			root.leftNode.rightNode.rightNode = new Node(5);//
			root.rightNode.leftNode.leftNode =new Node(3);//
			
			root.leftNode.leftNode.leftNode = new Node(2);
			root.rightNode.rightNode.rightNode = new Node(6);
			
			statRefRoot= root;
			left=true;
			
			mPrintNodes(root);
			
	}
	
    static void mPrintNodes(Node node)
    {
    	
    	
    	if(left)
    	{
	    	if (node != null)
	    	{
	    		System.out.println(node.data);
	    		mPrintNodes(node.leftNode);
	    	}
	    	else
	    	{
	    		//mPrintNodes(node.leftNode);
	    		left = false;
	    	}
	    		
    	}
    	
    	//backtracking postion
        if (node == statRefRoot || right==true)
    	{
    		if(node == statRefRoot)
        	{
    			right=true;
        	}
    		
        	if(node != null)
        	{
        		System.out.println(node.data);
        		mPrintNodes(node.rightNode);
        	}
    	}
    	
    }
}
