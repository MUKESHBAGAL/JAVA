import java.util.Scanner;
class Pattern {
	public static void Simple_pattern(int n){
		for(int i=0;i<n;i++){
			System.out.print("* * * * *");
			System.out.println();
		}
		
		
	}
	public static void main(String args[]){
		Scanner SC=new Scanner(System.in);
		System.out.print("Enter a number of line to print Squre star: ");
		int n=SC.nextInt();
		Simple_pattern(n);
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
