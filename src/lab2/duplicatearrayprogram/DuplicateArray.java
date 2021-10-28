//Aim: Create a method which accepts an integer array and removes all the duplicates in the array. Return the resulting array in descending order
package lab2.duplicatearrayprogram;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateArray
{
	static int[] modifyArray(int[] arr)
	{

		// logic for identify duplicate elements in array
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j])
					arr[j] = 0;
			}
		}

		System.out.println("After removing duplicate elements: ");
		for (int remDupArr : arr) {
			System.out.print(remDupArr + " ");
		}

		System.out.println();
		// sort the array after removing duplicates
		System.out.println("Sorted Array after removing duplicate elements is: ");
		Arrays.sort(arr);
		return arr;

	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		// to take size of the array from user
		System.out.println("Enter the size of an array: ");
		int length = sc.nextInt();

		int[] arr = new int[length];
		System.out.println("Enter " + length + " elements in array: ");

		for (int i = 0; i < length; i++) {
			// reading array elements from the user
			arr[i] = sc.nextInt();
		}
		System.out.println("Original Array is: ");
		for (int orArr : arr)
			System.out.print(orArr + " ");

		System.out.println();

		modifyArray(arr);
		for (int modArr : arr)
			System.out.print(modArr + " ");

		// closing of resource
		sc.close();

	}

}
