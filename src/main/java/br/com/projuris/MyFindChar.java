package br.com.projuris;

public class MyFindChar implements FindCharachter {

	public char findChar(String word) {
		char unrepeatedChar = ' ';

		for (int i = 0; i < word.length(); i++) {
			if (hasOnlyOneOccurrence(word, i)) {
				unrepeatedChar = word.charAt(i);
				break;
			}
		}
		return unrepeatedChar;
	}

	private boolean hasOnlyOneOccurrence(final String word, final int i) {
		return word.indexOf(word.charAt(i)) == word.lastIndexOf(word.charAt(i));
	}
}
