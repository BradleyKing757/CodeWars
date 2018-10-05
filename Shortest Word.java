/*
Simple, given a string of words, return the length of the shortest word(s).
String will never be empty and you do not need to account for different data types.
*/

public static int findShort(String s) {
		String[] words = s.split(" ");
		int smallest = words[0].length();

		for (int i = 1; i < words.length; i++) {
			if (words[i].length() < smallest) {
				smallest = words[i].length();
			}
		}
		return smallest;
	}
