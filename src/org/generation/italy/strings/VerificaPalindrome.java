package org.generation.italy.strings;

import java.util.Scanner;

public class VerificaPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * * chiedere all’utente di inserire una parola
		 * verificare se è palindroma
		 * stampare in console la lunghezza della parola e se è palindroma oppure no
		 * 
		 * so
		 * scanner input
		 * reverse
		 * is A = reverseA
		 * print: length + yay/nay p
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Verificatore di vocaboli palindromi");
		System.out.println("Iserisci la parola che vuoi controllare: ");
		String yourWord = scan.nextLine();
		String reverseWord = "";
		String output = "";
		
		char c;
		
		for (int i = 0; i < yourWord.length(); i++) {
			c = yourWord.charAt(i);
			System.out.print(c);
		}
		
		System.out.println();
		
		for (int i = yourWord.length()-1; i >= 0; i--) {
			c = yourWord.charAt(i);
			System.out.print(c);
			
			reverseWord = reverseWord + c;
			
			if (yourWord.equals(reverseWord)) {
				output = "Questa parola è palindroma";
			} else {
				output = "Questa parola non è palindroma";
			}
			
		}
		

		System.out.println();
		System.out.print(output);
		
		
		scan.close();

	}

}
