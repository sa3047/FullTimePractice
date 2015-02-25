package com.javaprograms.string;

import java.util.Set;
import java.util.List;

import java.util.ArrayList;
import java.util.HashSet;

import java.util.Arrays;


public class Run {
	
	static List <String> allPermutationsOfSubsequences( Set <Character> chars ) {
		
		Set < Set <Character> > powerSetOfChars = generatePowerSet ( chars );
		
		List <String> permutations = new ArrayList <String> ();
		
		for (Set <Character> subsequence : powerSetOfChars)
			permutations.addAll( generatePermutations ( subsequence ) );
		
		return permutations;
	}
	
	static Set <Set <Character>> generatePowerSet ( Set <Character> set ) {
		Set < Set<Character> > powerSet = new HashSet < Set <Character> > ();
		if (set.size() == 0) {
			powerSet.add(new HashSet <Character> ());
			return powerSet;
		}
		
		Character anElement = set.iterator().next();
		
		set.remove(anElement);
		
		for (Set <Character> subset : generatePowerSet(set)) {
			Set <Character> setWithElement = new HashSet <Character> ();
			setWithElement.add(anElement);
			setWithElement.addAll(subset);
			powerSet.add(setWithElement);
			powerSet.add(subset);
		}
		
		set.add(anElement);
		
		return powerSet;
	}
	static String answer = "";
	//Generates a list of permutations of the characters provided in the set.
	static List <String> generatePermutations ( Set <Character> chars ) {
		StringBuffer s = new StringBuffer(chars.size());
		for (Character c : chars)
			s.append((char)c);
		
		perm1(s.toString());
		
		String[] perms = answer.split("\\s");
		
		List <String> permutations = new ArrayList <String> (perms.length);
		
		for (String perm : perms)
			permutations.add(perm);
		
		answer = "";
		return permutations;
	}
	public static void perm1(String s) { perm1("", s); }
	
	private static void perm1(String prefix, String s) {
        int N = s.length();
        if (N == 0)
            answer += prefix + "\n";
        else {
            for(int i = 0; i < N; i++) {
				perm1(prefix + s.charAt(i), s.substring(0, i) + s.substring(i+1, N));
            }
        }
    }
	
	public static void main(String [] args) {
		System.out.println(allPermutationsOfSubsequences(new HashSet <Character> ( (List <Character>) Arrays.asList('D', 'I', 'G','I','T','A','L') )));
	}
}