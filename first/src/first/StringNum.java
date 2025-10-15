package first;
import java.util.Scanner;
public class StringNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter first name and surname:");
		String[] s1=new String[1];
		String[] s2=new String[1];
		s1[0]=sc.nextLine();
		s2[0]=sc.nextLine();
		int l1=s1[0].length();
		int l2=s2[0].length(); 
		char ch;
		int n1=0,n2=0;
		String str1="",str2="";
		for(int i=0;i<l1;i++)
		{
			ch=s1[0].charAt(i);
			if (ch >= '0' && ch <= '9')
			{
				str1=Character.toString(ch);
				n1=Integer.parseInt(str1);
			}	
		}
		for(int i=0;i<l2;i++)
		{
			ch=s2[0].charAt(i);
			if (ch >= '0' && ch <= '9')
			{
				str2=Character.toString(ch);
				n2=Integer.parseInt(str2);
			}
		}
		System.out.println("Sum="+(n1+n2));
		sc.close();
	}
}
