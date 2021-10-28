//Aim: Create a method which accepts an integer array, reverse the numbers in the array and returns the resulting array in sorted order
package lab2.sortedarrayprogram;

public class SortedArray 
{
	public static void main(String[] args)
	{
		int[] arr = new int[] { 15, 20, 33, 14, 22 };   //declared array
		int i, j, temp;
		System.out.println("Original array: ");
		for (i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");           //original array
		}
		System.out.println();
		System.out.println("Array in reverse order: ");

		for (i = arr.length - 1; i >= 0; i--)        //condition for reversing the array
		{
			System.out.print(arr[i] + " ");
		}
        System.out.println();
        
		System.out.println("elements sorted in the descending order");
		for (i = 0; i < arr.length; i++) 
		{
			for (j = i + 1; j < arr.length; j++)
			{
				if (arr[i] <arr[j])      //condition for desceding order
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		
			System.out.println("elements sorted in the ascending order");
			for (i = 0; i < arr.length; i++) 
			{  
			            for (j = i+1; j < arr.length; j++)
			            {     
			               if(arr[i] > arr[j])      // condition for ascending order
			               {    
			                   temp = arr[i];    
			                   arr[i] = arr[j];    
			                   arr[j] = temp;    
			               }  
			            }  
			            System.out.println(arr[i] + " ");
			        }   
			     System.out.println();
			}
		}

