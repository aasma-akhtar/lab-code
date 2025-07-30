package first;

import java.util.Scanner;
public class Runner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter two numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		Test obj= new Test();
		c=obj.call(a,b);
		if(c>30)
			System.out.println("Sum="+c);
		else
		{
			Runner ob=new Runner();
			ob.main(args);;
		}
		sc.close();
    }
}
class Test 
{
	public int call(int a, int b)
	{
		return a+b;
	}
}

	
