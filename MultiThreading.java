// Thread 1
public class MultiThreading extends Thread{

		@Override
		public void run()
		{
			// Initialize variables and array
			int total = 0, avg = 0;
			int Grades[] = {98, 54, 67, 73, 69, 89, 92, 77}; 
			
			// Loop through grades, add them to a total, print out total after every iteration
			for(int i = 0; i <= Grades.length - 1; i++) 
			{
				total += Grades[i];
				System.out.println(total);
				
				// Pause in between each iteration
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					
				}
			}
			// Calculate average and output results
			avg = total / Grades.length;
			System.out.println();
			System.out.println("Class Average: " + avg);
		}
		
	
}
