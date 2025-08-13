package first;

import java.util.Scanner;

public class Prime {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int srange,erange;
		System.out.println("Enter start range:");
		srange=sc.nextInt();
		System.out.println("Enter end range:");
		erange=sc.nextInt();
		int c=0;
		System.out.println("Prime numbers:");
		for(int i=srange; i<erange;i++)
		{
			for(int j=2;j<i/2;j++)
			{
				if(i%j==0)
					c+=1;
			}
			if(c==0)
				System.out.println(i);
			c=0;
		}
		sc.close();
	}

}
