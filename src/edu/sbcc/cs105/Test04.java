package edu.sbcc.cs105;

import java.util.*;

public class Test04 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int input;
		do {
			System.out.print("Please enter an integer between 0 and 100: ");
			input = in.nextInt();

		}

		while (input > 100 || input < 0);

		System.out.println(input);
		in.close();
	}

}
