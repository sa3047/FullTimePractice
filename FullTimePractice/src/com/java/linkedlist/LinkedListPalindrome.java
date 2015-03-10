package com.java.linkedlist;

/*
 * @author : Swapnil Aher
 * @date : 3/9/2015
 * @purpose: Linked list is palindrome or not is checked
 * */
public class LinkedListPalindrome {

	static ListNode startNode = null;
	static boolean result = true;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create a linked list
		ListNode first = new ListNode('A');
		first.next = new ListNode('B');
		first.next.next = new ListNode('C');
		first.next.next.next = new ListNode('B');
		first.next.next.next.next = new ListNode('A');

		startNode = first;

		if (isLinkedListPalindrome(first)) {
			System.out.println("Linked list is palindrome");
		} else {
			System.out.println("Linked list is not palindrome");
		}

	}

	static boolean isLinkedListPalindrome(ListNode node) {

		if (node.next != null)
			isLinkedListPalindrome(node.next);

		if (result == false) {
			result = false;
			// return result;
		} else {
			if (node.data != startNode.data) {
				return result = false;
			} else {
				startNode = startNode.next;
			}
		}

		return result;

	}

}

class ListNode {
	char data;
	ListNode next;

	public ListNode(char data) {
		this.data = data;
		this.next = null;
	}
}
