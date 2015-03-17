package com.java.javaconcepts;

import java.util.*;

public class RandomShuffle {

	public static void main(String args[]) {
		int[] solutionArray = {

		1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 
		14, 15, 16, 17, 18, 19, 20,	21, 22, 23, 24, 25, 26, 
		27, 28, 29, 30, 31, 32, 33, 34, 35, 36,	37, 38, 39, 
		40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52 
		};

		
		shuffleArray(solutionArray);

		for (int i = 0; i < solutionArray.length; i++) {
			System.out.print(solutionArray[i] + " ");
		}
		System.out.println();
	}

	// Implementing Fisher�Yates shuffle
	static void shuffleArray(int[] ar) {
		Random rnd = new Random();
		for (int i = ar.length - 1; i > 0; i--) {
			int index = rnd.nextInt(i + 1);
			// Simple swap
			int a = ar[index];
			ar[index] = ar[i];
			ar[i] = a;
		}
	}

}
