package first;
import java.util.Scanner;
public class Number {
	public static int revNum(int n)
	{
		int rev=0;
		while(n>0)
		{
			rev=(rev*10)+(n%10);
			n=n/10;
		}
		return rev;
	}
	public static int sumOfDig(int n)
	{
		int s=0;
		while(n>0)
		{
			s=s+(n%10);
			n=n/10;
		}
		return s;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		System.out.println("Reversed Number: "+revNum(num));
		System.out.println("Sum of Digits: "+sumOfDig(num));
		sc.close();
	}
}
