package first;
import java.util.Scanner;

public class Fruits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of fruits:");
		int count=sc.nextInt();
		int id[]=new int[count];
		int quna[]=new int[count];
		String des[]=new String[count];
		float cost[]=new float[count];
		System.out.println("Enter quantity, description and cost");
		for(int i=0;i<count;i++)
		{
			id[i]=i+1;
			quna[i]=sc.nextInt();
			des[i]=sc.next();
			cost[i]=sc.nextFloat();	
		}
		for(int i=0;i<count;i++)
		{
			
			System.out.println(id[i]+" "+quna[i]+" "+des[i]+" "+cost[i]);
		}
		System.out.println("Customer Module");
		System.out.println("How many items you want to buy ?");
		int cBuy=sc.nextInt(); 
		float bill=0.0f;
		for(int i=0;i<cBuy;i++)
		{
		System.out.println("Enter Item ID");
		int cid=sc.nextInt();
		System.out.println("Enter item quantity want to buy?");
		int cquan=sc.nextInt();
		bill=bill+cquan*cost[cid-1];
		
		}
		System.out.println("Final Bill="+bill);
		sc.close();
	}
}