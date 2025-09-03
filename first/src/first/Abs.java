package first;
import java.util.Scanner;
abstract class AbsT
{
	abstract int add(int a,int b);
}
class Imp extends AbsT
{
	@Override
	int add(int a, int b) 
	{
		return a+b;
	}
}
public class Abs 
{
    public static void main(String args[])
    {
    	Imp ob=new Imp();
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter two numbers");
    	int a=sc.nextInt();
    	int b=sc.nextInt();
    	System.out.println("Sum="+ob.add(a, b));
    	sc.close();
    }
}
