package br.com.projuris;

import org.junit.Assert;
import org.junit.Test;

public class MyFindArrayTest {

	@Test
	public void testFindArray() throws Exception {
		final MyFindArray myFindArray = new MyFindArray();
		final int[] array = { 4, 9, 3, 7, 8, 3 };
		final int[] subArray = { 3, 7 };
		final int result = myFindArray.findArray(array, subArray);
		Assert.assertEquals(2, result);
	}

	@Test
	public void testFindArrayAtBegining() throws Exception {
		final MyFindArray myFindArray = new MyFindArray();
		final int[] array = { 1, 3, 5 };
		final int[] subArray = { 1 };
		final int result = myFindArray.findArray(array, subArray);
		Assert.assertEquals(0, result);
	}
	
	@Test
	public void testFindArrayNoMach() throws Exception {
		final MyFindArray myFindArray = new MyFindArray();
		final int[] array = { 7, 8, 9 };
		final int[] subArray = { 8, 9, 10 };
		final int result = myFindArray.findArray(array, subArray);

		Assert.assertEquals(-1, result);
	}
	
	@Test
	public void testFindArrayLastOfMultipleResults() throws Exception {
		final MyFindArray myFindArray = new MyFindArray();
		final int[] array = { 4, 9, 3, 7, 8, 3, 7 };
		final int[] subArray = { 3, 7 };
		final int result = myFindArray.findArray(array, subArray);
		
		Assert.assertEquals(5, result);
	}
	
}
