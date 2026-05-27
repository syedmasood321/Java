import java.util.Scanner;
public class MatrixMultiplication
{
    public static void MatrixMul()
    {
        System.out.println("*************MULTIPICATION OF TWO MATRIXES*************");
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the row size:");
        int row=s.nextInt();
        System.out.println("Enter the column size:");
        int column=s.nextInt();
        int [][] arr=new int[row][column];
        System.out.println("Enter the matrix values:");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                arr[i][j]=s.nextInt();
            }
        }
        System.out.println("**************** FIRST MATRIX***************");
        System.out.println("The array elements are:");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                System.out.print("["+arr[i][j]+"]"+" ");
            }
            System.out.println();
        }
        //-------------------------------------------------------------------------------------------------------------------
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the row size:");
        int row1=s1.nextInt();
        System.out.println("Enter the column size:");
        int column1=s1.nextInt();
        int [][] arr1=new int[row1][column1];
        System.out.println("Enter the matrix values:");
        for(int m=0;m<row1;m++)
        {
            for(int n=0;n<column1;n++)
            {
                arr1[m][n]=s1.nextInt();
            }
        }
        System.out.println("**************** SECOND MATRIX***************");
        System.out.println("The array elements are:");
        for(int m=0;m<row;m++)
        {
            for(int n=0;n<column;n++)
            {
                System.out.print("["+arr[m][n]+"]"+" ");
            }
            System.out.println();
        }
        //----------------------------------------------------------------------------------------------------
        if(column!=row1)
        {
            System.out.println("These two matrixes are not multiply");
            return;
        }
        System.out.println("Multipication of two matrixes is:");
        int [][] arr2=new int[row][column1];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column1;j++)
            {
                for(int k=0;k<column1;k++)
                {
                    arr2[i][j]+=arr[i][k]*arr1[k][j];
                }
            }
        }
        System.out.println("MULTIPLICATION MATRIX");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column1;j++)
            {
                System.out.print("["+arr2[i][j]+"]"+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        MatrixMultiplication m=new MatrixMultiplication();
        m.MatrixMul();
    }
}