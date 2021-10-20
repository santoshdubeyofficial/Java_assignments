package lab2;
import java.util.Arrays;

public class AlphabetSort {

	public static void main(String[] args) {
		
		String [] stringArray = {"ac", "Ab", "d", "1", "2", "1ad", "A10"};
	    sortString(stringArray);

	}

	public static void sortString(String[] sArr)
	{
	    Arrays.sort(sArr);
	    System.out.println(Arrays.toString(sArr));
	}
}
