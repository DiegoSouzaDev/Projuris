package br.com.projuris;

public class MyFindChar implements FindCharachter {

	public char findChar(String word) {
		char unrepeatedChar = ' ';

		for (int i = 0; i < word.length(); i++) {
			if (isFirstOccurrence(word, i) && isLastOccurrance(word, i)) {
				unrepeatedChar = word.charAt(i);
				break;
			}
		}
		
		return unrepeatedChar;
	}
	
	private boolean isLastOccurrance(String word, int i) {
		return word.lastIndexOf(word.charAt(i)) == i;
	}
	
	private boolean isFirstOccurrence(String word, int i) {
		return word.indexOf(word.charAt(i)) == i;
	}

}
