class Prime_Number{
	public static void main(String[] args){
		int num=19;
		int count=0;
		for(int i=1;i<=num;i++){
			if(num%i==0)
			count++;
		}
		if(count==2)
			System.out.printf("%d is a Prime Number\n",num);
		else
			System.out.printf("%d is not a Prime Number\n",num);
	}
}

 
//OUTPUT::

//	19 is a Prime Number

