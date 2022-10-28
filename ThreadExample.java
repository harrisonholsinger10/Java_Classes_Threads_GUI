import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ThreadExample {

	public static void main(String[] args) {

		Thread3 thread1 = new Thread3("Hello.txt"); 
		thread1.start();
		Thread3 thread2 = new Thread3("randtxt.txt");
		thread2.start();
	}
}

class Thread3 implements Runnable {

	Thread thread;
	private String fileName;
	Thread3(String threadname) {
		fileName = threadname;
	}

	public void run() {
		for(int i = 0; i < 2; i++)
		{
			System.out.println(i);
			System.out.println(fileName);

			try							
			{
				File file = new File(fileName); 
				Scanner scan1 = new Scanner(file);
														
				while (scan1.hasNextLine()) // loop through file and display contents
			    {
			        String input = scan1.nextLine();
			        System.out.println("From file: " + input);
			    }
				
			}
			catch(FileNotFoundException e)
			{
				System.out.println("File not found!");	// file not found exception
			}
		}
	}

	public void start() {
		System.out.println("Thread started");

		/*taking an if condition to check whether class variable thread 
		has value in it or no. If its null then we are creating an instance using 
		thread class which takes the name as a parameter (value for which was assigned 
		in the constructor). After which the thread is started using start() method.*/
		if (thread == null) {
			thread = new Thread(this, fileName);
			thread.start();
		}

	}
}

