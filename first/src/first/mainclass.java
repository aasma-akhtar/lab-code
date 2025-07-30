package first;

import java.util.Scanner;

public class mainclass {
 
	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		Add ob=new Add();
		System.out.println("Enter two number:");
		a=sc.nextInt();
		b=sc.nextInt();
		ob.add(a,b);
		sc.close();
	}
}
