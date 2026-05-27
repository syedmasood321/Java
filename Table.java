import java.util.Scanner;
public class Table
{
    static Scanner s=new Scanner(System.in);
    static int Choice;
    public static void menu()
    {
    System.out.println();
    System.out.println("TABLE GENERATOR");
    System.out.println("========================================");
    System.out.println("1.Generate Single Table");
    System.out.println("2.Generate Multiple Tables");
    System.out.println("3.Exit");
    System.out.println("---------------------------------------");
    System.out.println("Please Select an above options:");
    Choice=s.nextInt();
    System.out.println("----------------------------------");
    }
    public static void table()
    {
        System.out.println("Enter the table number:");
        int value=s.nextInt();
        int k;
        for(k=1;k<=10;k++)
        {
            System.out.println(value+ "x" +k+ "="+(value*k));
        }
    }
    
    public static void tables()
    {
        System.out.println("How many tables do you want: ");
        int num;
        int n=s.nextInt();
        System.out.println("Enter the range:");
        int range=s.nextInt();
        for(num=1;num<=n;num++)
        {
        System.out.println("--------------------------------");
        for(int j=1;j<=range;j++)
        {
            System.out.println(num+ "x "+j+ " ="+(num*j));
        }
    }
}

    public static void main(String args[])
    {
    menu();
    while(true)
    {
    switch(Choice)
    {
        case 1:
            table();
            menu();
            break;
        case 2:
            tables();
            menu();
            break;
        case 3:
            System.out.println("Thank you");
            System.exit(0);
            break;
        default:
            System.out.println("Invalid option,try again....");
    }
    s.close();
}
    }
}
