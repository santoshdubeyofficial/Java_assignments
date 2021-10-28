
package lab2.alphabetsortprogram;

import java.util.Arrays;

public class AlphabetSort
{
	public static void sortString(String[] sArr)
	{
		Arrays.sort(sArr);
		System.out.println(Arrays.toString(sArr));  //to print the second se
	}
	public static void main(String[] args)
	{
		String[] stringArray = { "am", "Ab", "d", "1", "2", "5ad", "B20" };
		sortString(stringArray);

	}
}
