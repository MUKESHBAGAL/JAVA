import java.util.Scanner;

class Pattern {
    public static void Butterfly_pattern(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (n - i); j++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (n - i); j++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter a number of lines to print the butterfly pattern: ");
        int n = SC.nextInt();
        Butterfly_pattern(n);
    }
}

/*
OUTPUT::
Enter a number of lines to print the butterfly pattern: 4
*      *
**    **
***  ***
********
********
***  ***
**    **
*      *

*/
