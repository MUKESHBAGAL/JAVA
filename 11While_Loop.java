//In this Program we execte the cod e is sum of 1 to 10 number(means 1+2+3+.......9+10)
class While_Loop{
	public static void main(String [] args){
		int i=1,n=10,sum=0;
		while(i<=10){
			sum=sum+i;
			i++;//increment op
		}
		System.out.println("Sum of 1+2+3+.......9+10 is : "+sum);
	}
}
