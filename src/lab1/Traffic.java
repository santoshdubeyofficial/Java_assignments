package lab1;
import java.util.*;
import java.io.*;
public class Traffic {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the choice");
		int op=sc.nextInt();
		if(op==1)
			System.out.println("stop");
		else if(op==2)
			System.out.println("Ready");
		else if(op==3)
		 System.out.println("go");
		else
			System.out.println("wrong choice");
	}
}
