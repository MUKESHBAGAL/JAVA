import java.util.Scanner;

class Pattern {
    public static void Diamond_pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter a number of lines to print the Diamond pattern: ");
        int n = SC.nextInt();
        Diamond_pattern(n);
    }
}

/*
OUTPUT::
Enter a number of lines to print the Diamond pattern: 5
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
*/
