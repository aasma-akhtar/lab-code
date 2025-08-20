package first;

import java.util.Scanner;

public class ArrPass {
	public ArrPass(int a[], int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		new ArrPass(arr,n);
		sc.close();
	}

}
