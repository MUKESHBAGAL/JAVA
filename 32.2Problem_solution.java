import java.util.Scanner;
class Pattern {
	public static void Reverse_Triangular_pattern(int n){
		for(int i=n;i>=1;i--){
		    for(int j=1;j<=i;j++){
			System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
		
	}
	public static void main(String args[]){
		Scanner SC=new Scanner(System.in);
		System.out.print("Enter a number of line to print Triangular  star: ");
		int n=SC.nextInt();
		Reverse_Triangular_pattern(n);
	}
	
}
/*
OUTPUT::
Enter a number of line to print Triangular  star: 5
Enter a number of line to print Triangular  star: 5
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 
*/
