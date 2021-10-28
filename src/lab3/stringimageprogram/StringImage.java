//Aim: Java program to create a class Containing a method to mirror the image of a String.
package lab3.stringimageprogram;

import java.util.Scanner;

public class StringImage
{
	// logic for reverse the string
		public static String getImage(String str) {
			String revStr = "";
			for (int i = str.length() - 1; i >= 0; i--) {
				revStr += str.charAt(i);
			}

			// mirror the string
			str = str + "|" + revStr;
			return str;
		}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String that you want to mirror: ");
		// ask for user input
		String str = sc.nextLine();
		System.out.println("Mirror String is: " + getImage(str));
		sc.close();
	}
	}