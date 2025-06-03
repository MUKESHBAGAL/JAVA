import java.util.Scanner;

class Pattern {
    public static void Hollow_Rombus_pattern(int TotalRow, int TotalColumn) {
        for (int i = 1; i <= TotalRow; i++) {
            for (int j = 1; j <= TotalColumn - i; j++)
                System.out.print("  ");
            for (int j = 1; j <= TotalColumn; j++) {
                if (i == 1 || i == TotalRow || j == 1 || j == TotalColumn) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter the Length of Hollow Rombus: ");
        int TotalRow = SC.nextInt();
        System.out.print("Enter the Breadth of Hollow Rombus: ");
        int TotalColumn = SC.nextInt();
        Hollow_Rombus_pattern(TotalRow, TotalColumn);
    }
}

/*
OUTPUT::
Enter the Length of Hollow Rombus: 4
Enter the Breadth of Hollow Rombus: 5
        * * * * * 
      *       * 
    *       * 
  * * * * * 

*/
