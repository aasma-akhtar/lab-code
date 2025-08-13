package first;

import java.util.Scanner;

public class ToRun {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n1,n2;
		System.out.println("Enter range:");
		n1=sc.nextInt();
		n2=sc.nextInt();
		Check obj=new Check();
		obj.conditions(n1,n2);
		sc.close();
	}
}
