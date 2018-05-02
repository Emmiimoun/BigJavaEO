package bigJavaCh19;

import java.io.*;
import java.util.*;

public class StreamDemo {
    public static void main(String[] args) throws IOException {
	// Scanner in = new Scanner(new File("../countries.txt"));
	Scanner in = new Scanner(new File("data.txt"));

	// This file contains one country name per line
	List<String> wordList = new ArrayList<>();
	while (in.hasNextLine()) {
	    wordList.add(in.nextLine());
	}
	// Now wordList is a list of country names

	// Traditional loop for counting the long words
	long count = 0;
	for (String w : wordList) {
	    if (w.length() > 10) {
		count++;
	    }
	}

	System.out.println("Long words: " + count);

	// The same computation with streams
	count = wordList.stream().filter(w -> w.length() > 10).count();

	System.out.println("Long words: " + count);
    }
}
