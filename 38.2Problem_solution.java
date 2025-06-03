import java.util.Scanner;
class Pattern {
	public static void Rombus_pattern(int n){
		for(int i=0;i<n;i++){
		 for (int j = 1; j <= n - i; j++)
                   System.out.print(" ");
		 for(int j=1;j<=n;j++)
			System.out.print("* ");
			System.out.println();
		}
		
		
	}
	public static void main(String args[]){
		Scanner SC=new Scanner(System.in);
		System.out.print("Enter a number of line to print Squre star: ");
		int n=SC.nextInt();
		Rombus_pattern(n);
	}
	
}
/*
OUTPUT::
Enter a number of line to print Squre star: 5
     * * * * * 
    * * * * * 
   * * * * * 
  * * * * * 
 * * * * *
 
*/
