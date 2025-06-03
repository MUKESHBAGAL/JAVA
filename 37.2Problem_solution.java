import java.util.Scanner;
class Pattern {
	public static void Alphabet_Triangular_pattern(int n){
	char ch='A';
		for(int i=1;i<=n;i++){
		    for(int j=1;j<=i;j++){
			System.out.print(ch+" ");
			ch++;
			}
			System.out.println();
		}
		
		
		
	}
	public static void main(String args[]){
		Scanner SC=new Scanner(System.in);
		System.out.print("Enter a number of line to print Alphabet Triangular  star: ");
		int n=SC.nextInt();
		Alphabet_Triangular_pattern(n);
	}
	
}
/*
OUTPUT::
Enter a number of line to print Triangular  star: 4
A 
B C 
D E F 
G H I J 
*/
