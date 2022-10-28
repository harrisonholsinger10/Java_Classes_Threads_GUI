import java.util.Scanner;

// Harrison Holsinger

public class Test2Converter 
{

	public static void main(String[] args) 
	{
		//Create scanner object
		Scanner scan = new Scanner(System.in);
		double rate1 = 0.0, rate2 = 0.0, amount = 0.0, subtotal, total;
		boolean goodRate1 = false, goodRate2 = false, goodAmount = false;
		
		do
		{
			System.out.print("Enter a rate of currency to USD(Currency A): ");
			try
			{
				rate1 = Double.parseDouble(scan.next());
				goodRate1 = true;
			}
			catch(IllegalArgumentException e)
			{
				System.out.println("Invalid argument type entered.");	
				goodRate1 = false;
			}
			if(rate1 < 0)		
			{
			     goodRate1 = false;
			     System.out.println("Only Positive Numbers"); 
			}	
		}
		while(goodRate1 == false);
			
		do
		{
			System.out.print("Enter a different rate of currency to USD(Currency B): ");
			try
			{
				rate2 = Double.parseDouble(scan.next());
				goodRate2 = true;
			}
			catch(IllegalArgumentException e)
			{
				 System.out.println("Invalid argument type entered.");	
					goodRate2 = false;
			}
			if(rate2 < 0)		
			{
			     goodRate2 = false;
			     System.out.println("Only Positive Numbers"); 
			}	
		}
		while(goodRate2 == false);

		do
		{
			System.out.print("Enter an amount of currency of Currency A: ");
			try
			{
				amount = Double.parseDouble(scan.next());
				goodAmount = true;
			}
			catch(IllegalArgumentException e)
			{
				 System.out.println("Invalid argument type entered.");	
				 goodAmount = false;
			}	
			if(amount < 0)		
			{
			     goodAmount = false;
			     System.out.println("Only Positive Numbers");
			}	
		}
		while(goodAmount == false);
		
		subtotal = amount * rate1;
		total = subtotal * (1/rate2);
		System.out.printf("The amount of Currency A converted to Currency B is: %.2f", total);
		
		scan.close();


	}

}
