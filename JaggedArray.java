import java.util.Scanner;
public class JaggedArray
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the row size:");
        int row=s.nextInt();
        int[][] arr=new int[row][];
        for(int i=0;i<arr.length;i++)
        {
        System.out.println("____________________________________________________________");
        System.out.println("Enter size for arr "+ "["+i+"]"+":");
        int elements=s.nextInt();
        arr[i]=new int[elements];
        }
        System.out.println("Enter the array elements:");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=s.nextInt();
            }
        }
        System.out.println("____________________________________________________________");
        System.out.println("The jagged array is:");
        for(int i=0;i<arr.length;i++)
        {
            for (int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int max=arr[0][0];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]>=max)
                {
                    max=arr[i][j];
                }
            }
        }
        System.out.println("____________________________________________________________");
        System.out.println("The maximum number is:"+max);
        for(int k=0;k<arr.length;k++)
        {
            int result=0;
            for(int j=0;j<arr[k].length;j++)
            {
                result=result+arr[k][j];
            }
            System.out.println("____________________________________________________________");
            System.out.println("The sum of arr"+"["+k +"]"+ "is:"+result);
        }
        for(int k=0;k<arr.length;k++)
        {
            System.out.println("____________________________________________________________");
            System.out.print("The even number of arr"+"["+k +"]"+ "is:");
            for(int j=0;j<arr[k].length;j++)
            {
                if(arr[k][j]%2==0)
                {
                    System.out.print(arr[k][j]+" ");
                }
            }
            System.out.println();
     }
        System.out.println("____________________________________________________________");   
        System.out.println("The reverse number is:");
        for(int i=0;i<arr.length;i++)
        {
            for (int j=arr[i].length-1;j>=0;j--)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("____________________________________________________________");
    }
}
