package com.java.trees;

public class SumEqualGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
			
			sumEqToNumber(root, 300, 0);
	}
	
	
	static boolean sumEqToNumber(TreeNode node,int number,int totalsum)
	{
		int sum=0;
		
		//calculate the sum 
		sum = totalsum + node.data;
		
		//this is leaf node
		if (node.leftNode == null & node.rightNode==null)
		{
			//check the sum 
			
			if (sum == number)
			{
				System.out.println("Root to leaf path sum equal to a given number is present");
				return true;
			}
		}
		else
		{
			if(node.leftNode!= null)
			sumEqToNumber(node.leftNode, number, sum);
			
			if(node.rightNode!=null)
			sumEqToNumber(node.rightNode, number, sum);
		}
	
		return false;
	}

}
