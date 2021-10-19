package arrays;
import java.util.*;
import java.io.*;
public class MinValue {
 static int getMin(int arr[],int n)
 {
	 int res=arr[0];
	 for(int i=1;i<n;i++)
	 {
		 res=Math.min(res, arr[i]);
	 }
	 return res;
 }
 public static void main(String[] args)
{
	 int arr[]= {12, 15, 47, 65 };
	 int n=arr.length;
	 System.out.println("minimum element of an array is: "+getMin(arr,n));
 }
}