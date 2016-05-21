package org.practice;

import java.util.Arrays;

/**
 * Program : String Manipulation
 * Author : Shankhadeep Ghosh
 * Email : shankhadeep.ghosh@gmail.com
 */

public class StringManipulation {

	public static void main(String[] args) {
		System.out.println("Input String : " +args[0]);
		manipulatedString(args[0]);
	}

	private static void manipulatedString(String inputString) {
		
		int sumOfIntegers = 0;
		int characterCount = 0;
		int spclCharacCount = 0;
		char[] characters = new char[inputString.length()];
		char[] spclCharacters = new char[inputString.length()];
		
		
		String outputString = "";
		
		for (int i = 0; i < inputString.length(); i++) {
			char c = inputString.charAt(i);
			
			if(Character.isAlphabetic(c)) {
				characters[characterCount] = c;
				characterCount ++;
			} else if(Character.isDigit(c)) {
				sumOfIntegers = sumOfIntegers + Integer.parseInt(String.valueOf(c));
			} else {
				spclCharacters[spclCharacCount] = c;
				spclCharacCount ++;
			}
		}
		
		Arrays.sort(characters);
		
		if(characters.length > 0) {
			for (char charact : characters) {
				outputString = outputString + charact;
			}
		}
		if(sumOfIntegers > 0)
			outputString = outputString + String.valueOf(sumOfIntegers);
		
		if(spclCharacters.length > 0) {
			for (char spclChar : spclCharacters) {
				outputString = outputString + spclChar;
			}
		}
		
		System.out.println("Output Manipulated : " + outputString.trim());
	}

}
