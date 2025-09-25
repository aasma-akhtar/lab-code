package first;
class Student
{
 int id;
 String name;
 int marks;
 static int students=0;
 public Student(int id, String name, int marks)
 { 
   this.id=id;
   this.name=name;
   this.marks=marks;
   students+=1;
 }
 @Override
 public String toString()
 { 
   return "Student Id= "+id+", Student Name= "+name+", Marks="+marks;
 }
}
public class MainCall
{
 public static void main(String args[])
 {   
  Student s1= new Student(1, "Aasma", 90);
  Student s2= new Student(2, "ABC", 70);
  Student s3= new Student(3, "XYZ", 80);
  System.out.println(s1);
  System.out.println(s2);
  System.out.println(s3);
  System.out.println("No of students= "+Student.students);
 }
}
   
   

