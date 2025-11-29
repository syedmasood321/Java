import java.util.Scanner;
public class Prime
{
    static boolean isPrime(int num)
    {
        if(num<=1)
    {
        return false;
    }
        else if(num==2)
        {
           return true;
        }
        else if(num%2==0)
        {
            return false;
        }
        for(int i=3;i*i<=num;i=i+2)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        {
            return true;
        } }

  public static void main(String args[])
{
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a number:");
    int num=s.nextInt();
    if( isPrime(num))
    {
        System.out.println( num+ "is a prime number");
    }
    else
    {
        System.out.println( num+ "is not a prime number");
    }
    
}
}

