package first;

import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		String n=sc.nextLine();
		System.out.println("Fourth character= "+n.charAt(3));
		sc.close();
	}
}
