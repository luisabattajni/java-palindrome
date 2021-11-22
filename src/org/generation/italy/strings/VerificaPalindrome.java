package org.generation.italy.strings;

import java.util.Scanner;

public class VerificaPalindrome {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Verificatore di vocaboli palindromi");
		System.out.println("Iserisci la parola che vuoi controllare: ");
		String yourWord = scan.nextLine();
		String reverseWord = "";
		String output = "";
		
		char c;
		
		for (int i = yourWord.length()-1; i >= 0; i--) {
			c = yourWord.charAt(i);
			
			reverseWord = reverseWord + c;
			
			if (yourWord.equals(reverseWord)) {
				output = "Questa parola è palindroma.";
			} else {
				output = "Questa parola non è palindroma.";
			}
		}
		
		System.out.print("Questa parola contiene " + yourWord.length() + " caratteri. " + output);
		
		scan.close();
	}

}
