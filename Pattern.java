public class Pattern {
    public static void main(String[] args) {

        int rows = 5;
        int space = 0;

        System.out.println("*");

        for(int row = 2; row < rows; row++) {
            System.out.print("*");

            for(int s = 0; s < space; s++) 
                System.out.print(" ");

            System.out.println("*"); 
            space++; 
        }

        for(int col = 1; col <= rows; col++)
            System.out.print("*");
            System.out.print(" ");
    }
}