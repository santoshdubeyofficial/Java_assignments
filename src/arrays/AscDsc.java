package arrays;
import java.util.*;
import java.io.*;
public class AscDsc
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,j,n,temp;
		System.out.println("enter the number of elements");
		n=sc.nextInt();
		int []a=new int[n];
		System.out.println("enter the elements into the array");
			for(i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			for(i=0;i<n;i++) {
				for(j=i+1;j<n;j++)
				{
					if(a[i]<a[j])
					{
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
			System.out.println("elements sorted in the descending order");
				for(i=0;i<n;i++)
				{
				 System.out.println(a[i]+" ");
				}
				for(i=0;i<n;i++) {
					for(j=i+1;j<n;j++)
					{
						if(a[i]>a[j])
						{
							temp=a[i];
							a[i]=a[j];
							a[j]=temp;
						}
					}
					System.out.println("elements sorted in the ascending order");
					for(i=0;i<n;i++)
					{
					 System.out.println(a[i]+" ");
					}
		}
	}
}


