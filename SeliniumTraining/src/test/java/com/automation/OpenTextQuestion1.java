package com.automation;

import java.util.ArrayList;
import java.util.Random;

public class OpenTextQuestion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N = 8;
		int K = 3;
		int temp = 0;

		String str = "";

		String palindrome = null;
		StringBuilder strReverse = new StringBuilder();

		ArrayList<Character> arrlist = new ArrayList<Character>();

		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int l = alphabet.length();

		Random r = new Random();

		for (int i = 0; i < K; i++) {

			arrlist.add(alphabet.charAt(r.nextInt(l)));

		}
		System.out.println(arrlist);

		for (int j = 0; j < N / 2; j++) {

			str = str + arrlist.get(temp);
			temp = temp + 1;
			if (temp == (K)) {
				temp = 0;
			}
		}
		System.out.println(str);

		strReverse.append(str);
		strReverse.reverse();

		if (N / 2 == 0)
			palindrome = str + strReverse;
		else
			palindrome = str + arrlist.get(0) + strReverse;

		System.out.println(palindrome);

	}

}
