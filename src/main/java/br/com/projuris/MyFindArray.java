package br.com.projuris;

public class MyFindArray implements FindArray {
	
	private static final int NOT_FOUND = -1;

	public int findArray(int[] array, int[] subArray) {
		int startFrom = 0;
		int result = NOT_FOUND;
		boolean isPossibleToFind = true;

		while (isPossibleToFind) {
			final int firstOccur = indexOf(array, subArray[0], startFrom);

			if (firstSubArrayElementExistsInArray(result, firstOccur) && subArrayFitsAfterResult(array, subArray, firstOccur)) {
				boolean isAMach = true;
				int index = 0;
				
				for (final int position : subArray) {
					if (position == array[firstOccur + index]) {
						index++;
					} else {
						isAMach = false;
						break;
					}
				}
				if (isAMach) {
					result = firstOccur;
					if (array.length - (firstOccur + 1 + subArray.length) >= subArray.length) {
						startFrom = firstOccur + subArray.length;
					} else {
						isPossibleToFind = false;
					}
				}
			} else {
				isPossibleToFind = false;
			}
		}
		return result;
	}
	
	public int indexOf(final int[] array, final int key, final int startFrom) {
		int returnvalue = -1;
		for (int i = startFrom; i < array.length; ++i) {
			if (key == array[i]) {
				returnvalue = i;
				break;
			}
		}
		return returnvalue;
	}
	
	private boolean firstSubArrayElementExistsInArray(final int result, final int firstOccur) {
		return firstOccur != NOT_FOUND;
	}
	
	private boolean subArrayFitsAfterResult(int[] array, int[] subArray, int firstOccur) {
		return array.length - (firstOccur) >= subArray.length;
	}
	
}
