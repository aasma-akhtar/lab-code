package first;
abstract class One
{
  abstract void showOne();
}
abstract class Two extends One
{
  abstract void showTwo();
}
class Display extends Two
{  
  @Override
  void showOne()
 {
  System.out.println("First Function");
 }
 @Override
 void showTwo()
 {
  System.out.println("Second Function");
 }
}
public class Main
{
 public static void main(String arg[])
 {
  Display ob= new Display();
  ob.showOne();
  ob.showTwo();
 }
}  