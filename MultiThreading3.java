// Thread 3
public class MultiThreading3 extends Thread{

	@Override
	public void run()
	{
		// Initialize variables and array
		int Wage[] = {10, 8, 12, 15, 25, 50, 35, 22};
		int Hours[] = {20, 45, 35, 56, 23, 50, 43, 37};
		int total = 0;
		int yearly = 0;
		// Loop through array, multiple by hours and store in "total", output each employye's weekly earnings
		for(int i = 0; i < Wage.length; i++)
		{
			total += Wage[i] * Hours[i];
			System.out.println("Employee: " + (i + 1) + " makes $" + (Wage[i] * Hours[i]) + " a week");
			// Pause in between each iteration
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}
		// Calculate yearly earnings and output results
		yearly = total * 12;
		System.out.println("The company employees will make $" + yearly + " a year");
		
	}
}
