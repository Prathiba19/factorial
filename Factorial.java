# factorial

public class Factorial {

	public static void main(String[] args) {
		int fact=1;
		int i;
		if(args.length==0)
		{
			System.out.println("Enter integer value");
		} 
		else
		{
			int num=Integer.parseInt(args[0]);
		
		 if(num!=0)
		{
			for(i=1;i<=num;i++)
			{
				fact=fact*i;
			}
			
			
				System.out.print("the factorial of "+num+" is "+fact);
			

		}
	
		 else
		 {
			 fact=fact*1 ;
		     System.out.println("the factorial of"+num+"is"+fact);
		 }
		}

	}
}
