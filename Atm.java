import java.util.Scanner;
public class Atm
{
    public static void main(String args[])
    {
        int money=1000;
        Scanner s=new Scanner(System.in);
        System.out.println("ATM FUNCTIONALITYS");
        System.out.println("=====================================");
        System.out.println("1.Deposit");
        System.out.println("2.With draw");
        System.out.println("3.total balance");
        System.out.println("4.Exit");
        while(true)
        {
        System.out.println("Choose above options:");
        int num=s.nextInt();
        if(num==1)
        {
            System.out.println("Deposit option");
            System.out.println("how much you want to add:");
            int a=s.nextInt();
            money=money+a;
            System.out.println("your total amount is:"+money);
        }
        else if(num==2)
        {
           System.out.println("With draw option");
            System.out.println("how much you want to take:");
            int b=s.nextInt();
            if(b>money)
            {
                System.out.println("insuffient balance!");
            }
            else
            {
            money=money-b;
            System.out.println("your total amount is:"+money); 
            }
        }
        else if(num==3)
        {
             System.out.println(" total balance option");
             System.out.println("Your total amount is:"+money);
        }
        else if(num==4)
        {   System.out.println(" Exit option");
            System.out.println("Thanku for visting our atm");
            break;
        }
        else
        {
            System.out.println("Invalid option!.....");
        }
        }


    }

}
