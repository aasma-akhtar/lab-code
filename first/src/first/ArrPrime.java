package first;

import java.util.Scanner;

public class ArrPrime {
	public static void main(String[] args) {
		int s,e;
		System.out.println("Enter the start range");
		Scanner sc=new Scanner(System.in);
		s=sc.nextInt();
		System.out.println("Enter the end range");
		e=sc.nextInt();
		int [] a=new int[e-s];
		int d=0;
		for(int i=s;i<e;i++) {
			int c=0;

			for(int j=2;j*j<=i;j++) {
				if(i%j==0) {
					c=c+1;
				}
			}
			
		}
		for(int i=s;i<e;i++) {
			int c=0;

			for(int j=2;j*j<=i;j++) {
				if(i%j==0) {
					c=c+1;
				}
			}
			if(c==0) {
				a[d]=i;
				d++;
			}
			
		}
		for(int i=0;i<d;i++) {
			System.out.println(a[i]);
		}
		sc.close();

	}
}
