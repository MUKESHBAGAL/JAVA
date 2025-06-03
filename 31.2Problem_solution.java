import java.util.Scanner;
class Pattern {
   public static void Inverted_Rotate_Triangular_pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter the number of lines to print the triangular star: ");
        int n = SC.nextInt();
        Inverted_Rotate_Triangular_pattern(n);
    }
	
}
/*
OUTPUT::
Enter the number of lines to print the triangular star: 5
    *
   **
  ***
 ****
*****
*/
