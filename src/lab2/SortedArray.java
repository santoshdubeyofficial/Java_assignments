package lab2;

public class SortedArray {
	 public static void main(String[] args) {  
	        
	        int [] arr = new int [] {15, 20, 33, 14, 22}; 
	        int i,j,temp;
	        System.out.println("Original array: ");  
	        for ( i = 0; i < arr.length; i++) {  
	            System.out.print(arr[i] + " ");  
	        }  
	        System.out.println();  
	        System.out.println("Array in reverse order: ");  
	 
	        for (i = arr.length-1; i >= 0; i--)
	        {  
	            System.out.print(arr[i] + " ");  
	        }  
	        
	        System.out.println("elements sorted in the descending order");
			for(i=0;i<arr.length;i++)
			{
				for(j=i+1;j<arr.length;j++)
				{
					if(arr[i]>arr[j])
					{
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
				System.out.println("elements sorted in the ascending order");
				for(i=0;i<arr.length;i++)
				{
				 System.out.println(arr[i]+" ");
				}
	}
	        	
	    }  
	} 
