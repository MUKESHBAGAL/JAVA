import java.util.Scanner;
class Array_Search_Element
{
	public static void main(String[] args)
	{   
		Scanner input =new Scanner(System.in);
		System.out.print("Enter the Array Limit :");
		int l =input.nextInt();
		int [] a =new int[l];
		for(int i=0;i<l;i++)
		{
			System.out.printf("Element of a[%d] :",i);
			a[i]=input.nextInt();
		}
		System.out.print("Enter the Search Array Element :");
		int s =input.nextInt();
		int i,f=0;
		for(i=0; i<l; i++)
		{
			if(a[i]==s)
			{				
				f=1;
				break;
			}
		}
		if(f==1)
		{
			System.out.printf("The Element is found in the position : %d", i + 1);
			System.out.printf("\nThe Element is found in the index : %d\n", i);
		}
		else
		{
			System.out.println("The Element is Not found\n");
		}
    }
}

/*
Output::
        Enter the Array Limit :10
        Element of a[0] :20
        Element of a[1] :30
        Element of a[2] :40
        Element of a[3] :50
        Element of a[4] :60
        Element of a[5] :70
        Element of a[6] :80
        Element of a[7] :90
        Element of a[8] :100
        Element of a[9] :10
        Enter the Search Array Element :60
        The Element is found in the position : 5
        The Element is found in the index : 4
*/
