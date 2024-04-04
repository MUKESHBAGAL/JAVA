class Reverse{
	public static void main(String[] args){
	int r,rev=0,num=2345;
	System.out.println("Original Number is :"+num);
		while(num>0){
			r=num%10;
			rev=(rev*10)+r;
			num=num/10;
		}
		System.out.println("After Reversing The Number: "+rev);
	}
}
