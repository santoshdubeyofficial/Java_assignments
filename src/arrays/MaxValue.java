package arrays;
import java.util.*;
import java.io.*;
public class MaxValue {
	
	 static int getMax(int arr[],int n)
	 {
		 int res=arr[0];
		 for(int i=1;i<n;i++)
		 {
			 res=Math.max(res, arr[i]);
		 }
		 return res;
	 }
	 public static void main(String[] args)
	{
		 int arr[]= {12, 15, 47, 65 };
		 int n=arr.length;
		 System.out.println("minimum element of an array is: "+getMax(arr,n));
	 }
	}