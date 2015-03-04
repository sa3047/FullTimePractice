package com.java.trees;

public class CountLeafNodes {

	static int cntOfLeafNodes=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
			
			Tree root = new Tree(1);
			root.leftNode= new Tree(2);
			root.rightNode = new Tree(3);
			
			root.leftNode.leftNode= new Tree(4); //
			root.leftNode.rightNode = new Tree(5); 
			root.rightNode.leftNode = new Tree(6); //
			root.rightNode.rightNode =new Tree(7);
			
			root.leftNode.rightNode.rightNode = new Tree(8);//
			root.rightNode.leftNode.leftNode =new Tree(9);//
			
			recurse(root,root);
			
			System.out.println("Total counts of leaf nodes in a tree "+ cntOfLeafNodes);
	}

	static void recurse(Tree root, Tree parent)
	{	
		// base condition
		// Going into Leaf node then increase the count
		if(root.leftNode == null && root.rightNode==null && root.visited == false)
		{
			System.out.print(root.data +" ");
			cntOfLeafNodes++;
			root.visited=true;
			return;
		}
			
		else
		{
			if(root.leftNode!=null) //don't recurse on left if node is not present e.g. Node 6
			recurse(root.leftNode,root);	
			
			if(root.rightNode!=null) //don't recurse on right if node is not present e.g. Node 5
			recurse(root.rightNode,root);
		}
			
	}
}
