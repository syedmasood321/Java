import java.util.Scanner;
public class Caluculator
{   
    static Scanner s=new Scanner(System.in);
    static int a,b;
    public void Main()
    {
        while(true)
        {
        System.out.println("--------SIMPLE CALUCULATOR--------");
        System.out.println("Choose your choice:");
        System.out.println(" 1.Addition\n 2.Subtraction\n 3.Multiplication\n 4.Division\n 5.Exit");
        System.out.println("Enter your choice:");
        int Choice=s.nextInt();
        if(Choice==5)
        {
            System.out.println("Exiting the caluculator...");
            break;
        } 
        
        System.out.println("Enter the the first number:");
        a=s.nextInt();
        System.out.println("Enter the second number:");
        b=s.nextInt();

        switch(Choice)
        {
        case 1:
            System.out.println("Addition:"+(a+b));
            break;
        case 2:
            System.out.println("Subtraction:"+(a-b));
            break;
        case 3:
            System.out.println("Multiplication:"+(a*b));
            break;
        case 4:
            if(b==0)
            {
                System.out.println("Can't be Divisible");
            }
            else 
            {
                System.out.println("Division:"+(a/b));
            }
            break;
        default:
            System.out.println("Invalid choice");
        } 
    } 
    }
    public static void main (String args[])
    { 
        Caluculator c=new Caluculator();
        c.Main();
    }
}