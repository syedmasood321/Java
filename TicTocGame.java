import java.util.Scanner;
public class TicTocGame
{
  
    public static void Board()
    {
     int [][]arr1={{1,2,3},{4,5,6},{7,8,9}};
     System.out.println("--------------------------------------------");
     for(int i=0;i<3;i++)
     {
      for(int j=0;j<3;j++)
      {    
        System.out.print("|"+arr1[i][j]+"|");
      }
      System.out.println();
     }
     System.out.println("--------------------------------------------------");
     
    }
    public static void PrintBoard(String[][] arr1)
    {
      for(int i=0;i<3;i++)
     {
      for(int j=0;j<3;j++)
      {    
        System.out.print("|"+arr1[i][j]+"|");
      }
      System.out.println();
     }
     System.out.println("--------------------");

    }
    public static void Player()
    {
        Scanner s=new Scanner(System.in);
        int moves=0;
        System.out.println("Two signs are there which one do you want 'X' or 'O' ");
        System.out.println("Select the sign for player-1:");
        String sign=s.nextLine();
        String a=sign.toUpperCase();
        System.out.println("Select the sign for player-2:");
        String sign1=s.nextLine();
        String b=sign1.toUpperCase();
        if(a.equals(b))
        {
          System.out.println("Both players cannot choose same sign");
          return;
        }
        System.out.println("Player-1 selects " +a + " and "+" Player-2 selects "+b);
        Board();
        String [][]arr1={{"1","2","3"},{"4","5","6"},{"7","8","9"}};
        while(true)
        {
          // Player-1------------------------------------------------------------------------
        System.out.println("Player-1 turn which number want to make "+a+":");
        int value=s.nextInt();
        boolean found=false;
        for(int i=0;i<3;i++)
        {
          for(int j=0;j<3;j++)
          {
        
        if(arr1[i][j].equals(String.valueOf(value)))
        {
          arr1[i][j]=a;
          found=true;
          moves++;
        }
      }
    } 
    if(found==false)
    {
      System.out.println("Position already filled or invalid");
    }
    PrintBoard(arr1);
    if(Checking(arr1,a,b))
{
    break;
}
if(moves==9)
    {
      System.out.println("Board full and No winner");
      System.out.println("Match draw");
      break;
    }
    // Player-2----------------------------------------------------------------
        System.out.println("Player-2 turn which number want to make "+b+":");
        int value1=s.nextInt();
        boolean found1=false;
        for(int i=0;i<3;i++)
        {
          for(int j=0;j<3;j++)
          {
          if(arr1[i][j].equals(String.valueOf(value1)))
        {
          arr1[i][j]=b;
          found1=true;
          moves++;
        }
      
      }
    }
  if(found1==false)
    {
      System.out.println("Position already filled or invalid");
    }
    
    PrintBoard(arr1);
    if(Checking(arr1,a,b))
{
    break;
}
if(moves==9)
    {
      System.out.println("Board full and No winner");
      System.out.println("Match draw");
      break;
    }

  }
  }
  public static boolean Checking(String[][]arr1,String a,String b)
  {
    int [][] combinations = {{0,0,0,1,0,2},{1,0,1,1,1,2},{2,0,2,1,2,2},{0,0,1,0,2,0},{0,1,1,1,2,1},{0,2,1,2,2,2},{0,0,1,1,2,2},{0,2,1,1,2,0}};
    for(int i=0;i<combinations.length;i++)
    {
       int r1 = combinations[i][0];
       int c1 = combinations[i][1];

       int r2 = combinations[i][2];
       int c2 = combinations[i][3];

       int r3 = combinations[i][4];
       int c3 = combinations[i][5];
       if(arr1[r1][c1].equals(a)&&arr1[r2][c2].equals(a)&&arr1[r3][c3].equals(a))
       {
        System.out.println("Player-1 won the match");
        return true;
       } 
       else if(arr1[r1][c1].equals(b)&&arr1[r2][c2].equals(b)&&arr1[r3][c3].equals(b))
       {
        System.out.println("Player-2 won the match");
        return true;
       }
      }
      return false;
    }

    
    

  public static void main(String args[])
{
    System.out.println("Welcome to TicToc game");
    Board();
    Player();
}
}