package arrays;
import java.util.*;
public class Sum {
 static int arr[]= {1,2,3,4,5};
 static int sum()
 {
	 int sum=0;
	 int i;
	 for(i=0;i<arr.length;i++)
	 {
		 sum+=arr[i];
	 }
	 return sum;
	 }
 public static void main(String args[]) {
	 System.out.println("Sum of give array is"+ sum());
 }
}