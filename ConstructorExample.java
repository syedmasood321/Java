public class ConstructorExample
{
    String name;
    int age;
    String rollno;
ConstructorExample(String name,int age,String rollno)
{
    this.name=name;
    this.age=age;
    this.rollno=rollno;
}
public static void main(String args[])
{
    ConstructorExample c=new ConstructorExample("Masood",19,"9807899");
    System.out.println("Name is :"+c.name);
    System.out.println("Age is:"+c.age);
    System.out.println("Roll no is:"+c.rollno);
}
}