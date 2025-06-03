import java.util.Scanner;
class Pattern {
	public static void Incr_Num_Triangular_pattern(int n){
	int count=1;
		for(int i=1;i<=n;i++){
		    for(int j=1;j<=i;j++){
			System.out.print(count+" ");
			 count++;
			}
			System.out.println();
		}
		
		
		
	}
	public static void main(String args[]){
		Scanner SC=new Scanner(System.in);
		System.out.print("Enter a number of line to print Triangular  star: ");
		int n=SC.nextInt();
		Incr_Num_Triangular_pattern(n);
	}
	
}
/*
OUTPUT::
Enter a number of line to print Triangular  star: 5
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
*/
