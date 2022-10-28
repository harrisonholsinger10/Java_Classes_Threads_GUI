// Thread 2
public class MultiThreading2 extends Thread{

	@Override
	public void run()
	{
		// Initialize variables and array
		int Grades[] = {67, 58, 98, 75, 91, 83, 98, 76};
		int aCount = 0, bCount = 0, cCount = 0, dCount = 0, fCount = 0; 
		// Loop through grades and assign each one a letter grade
		for(int i = 0; i <= Grades.length - 1; i++) 
		{
			System.out.println(Grades[i]);
			if(Grades[i] <= 100 && Grades[i] >= 90)
			{
				System.out.println('A');
				aCount++;
			}

			else if(Grades[i] >= 80)
			{
				System.out.println('B');
				bCount++;
			}      
			else if(Grades[i] >= 70)
			{
				System.out.println('C');
				cCount++;
			}       
			else if(Grades[i] >= 60)
			{
				System.out.println('D');
				dCount++;
			}
			else
			{
				System.out.println('F');
				fCount++;
			}  
			// Pause in between each iteration
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}
		// Find which counter is the highest and output results
		if(aCount > bCount && aCount > cCount && aCount > dCount && aCount > fCount)
		{
			System.out.println("There are more A's than any other grade");
		}
		else if(bCount > aCount && bCount > cCount && bCount > dCount && aCount > fCount)
		{
			System.out.println("There are more B's than any other grade");
		}
		else if(cCount > aCount && cCount > bCount && cCount > dCount && aCount > fCount)
		{
			System.out.println("There are more C's than any other grade");
		}
		else if(dCount > aCount && dCount > bCount && dCount > cCount && aCount > fCount)
		{
			System.out.println("There are more D's than any other grade");
		}
		else
		{
			System.out.println("There are more F's than any other grade");
		}
		
	}

}
