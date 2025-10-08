package first;
import java.util.*;
class TestNewException
{
 static int a=10;
 static Scanner sc=new Scanner(System.in);
 static int b=0;
 public static void expFirst()
 {
   try
   { 
     System.out.println("Enter:");
     b=sc.nextInt();
     int c=a/b;
     System.out.println("Result="+c);
   }
   catch(Exception e)
   {
     System.out.println("First Exception:"+e);
     sc.nextLine();
   }
}
public static void expSecond()
{
  try
  { 
    System.out.println("Enter:");
    b=sc.nextInt();
    int d=a+b;
    System.out.println("Result="+d);
  }
  catch(Exception e)
  {
    System.out.println("Second Exception:"+e);
    sc.nextLine();
  }
}
public static void expThird()
{
 try
 {
   int ar[]=new int[2];
   System.out.println("Enter no of elements:");
   int n=sc.nextInt();
   System.out.println("Enter elements:");
   for(int i=0;i<n;i++)
   {  
     ar[i]=sc.nextInt();
   }
 }
 catch(Exception e)
 {
  System.out.println("Third Exception:"+e);
  sc.nextLine();
 }
}
public static void main(String args[])
 { 
  TestNewException.expFirst();
  TestNewException.expSecond();
  TestNewException.expThird();
 }
}
   
     
 