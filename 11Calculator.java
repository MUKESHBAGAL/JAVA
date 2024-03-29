class Calculator{
	public static void main(String [] args){
		int num1=25,num2=15;
		int op=2;
		switch(op){
			case 1: System.out.println("Sum operation :"+(num1+num2));
				break;
			case 2: System.out.println("Subtract operation :"+(num1-num2));
				break;
			case 3: System.out.println("Multiplication operation :"+(num1*num2));
				break;
			case 4: System.out.println("Division operation :"+(num1/num2));
				break;	
			case 5: System.out.println("Square operation on num1 :"+(num1*num1));
				break;
			case 6: System.out.println("cube operation :"+(num2*num2*num2));
				break;
			case 7: System.out.println("Modulos operation :"+(num1%num2));
				break;
		
		       default : System.out.println("Something Error");
	
	}
	}
}
