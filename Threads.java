// Harrison Holsinger

public class Threads {
	// Main method
	public static void main(String[] args) {
			// Creating instances of each thread
			MultiThreading thread = new MultiThreading();
			MultiThreading2 thread1 = new MultiThreading2();
			MultiThreading3 thread2 = new MultiThreading3();
			
			// Starting the threads
			thread.start();
			thread1.start();
			thread2.start();
		}
	}


