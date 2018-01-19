package br.com.projuris;

import org.junit.Assert;
import org.junit.Test;

public class MyFindCharTest {

	@Test
	public void testFindCharBeforeDuplicatedLetter() throws Exception {
		final MyFindChar myFindChar = new MyFindChar();
		final String word = "stress";
		
		final char returnedChar = myFindChar.findChar(word);
		
		Assert.assertEquals('t', returnedChar);
	}
	
	@Test
	public void testFindCharAfterDuplicatedLetter() throws Exception {
		final MyFindChar myFindChar = new MyFindChar();
		final String word = "reembolsar";
		
		final char returnedChar = myFindChar.findChar(word);
		
		Assert.assertEquals('m', returnedChar);
	}

	@Test
	public void testFindCharWithNoResult() throws Exception {
		final MyFindChar myFindChar = new MyFindChar();
		final String word = "mussum";
		
		final char returnedChar = myFindChar.findChar(word);
		
		Assert.assertEquals(' ', returnedChar);
	}

}
