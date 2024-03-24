//this program for a condition Operator 
//using the conditional properties we find the largest number
// "Condition ? expression 1 : expression 2" when condition is right is or true then print expression  1  else expression 2
//                       ^              ^
//                       |              |
//    			 |              |
//              condition true    condition  false
class Conditional_OP{
	public static void main(String [] args){
		
		float num1=5.5f, num2=3.4f, result;
		
		result = (num1 > num2) ? num1 : num2;
		System.out.println("The larger number is "+result);
	}
	
}
