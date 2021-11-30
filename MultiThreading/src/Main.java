class ThreadDemo1 implements Runnable {

	@Override
	public void run() {
		try {
			System.out.println("Running thread-" + Thread.currentThread().getId());
		} catch (Exception ex) {
			System.out.println("Exception");
		}
	}
}

/*
 class ThreadDemo2 extends Thread { 
 	public void run() { 
 		try {
 			System.out.println("Running thread-" + Thread.currentThread().getId()); 
 		}
 		catch (Exception ex) { 
			System.out.println("Exception"); 
		} 
	} 
}
 */

public class Main {

	public static void main(String[] args) {
		int n = 5;
		System.out.println("Multi Threading by implementing Runnable Interface");
		System.out.println("===================================================");
		for (int i = 0; i < n; i++) {
			Thread object = new Thread(new ThreadDemo1());
			object.start();
		}

		/*		  
		 System.out.println("Multi Threading by extending Thread Class");
		 System.out.println("===================================================");
		 for (int i = 0; i < n; i++) { ThreadDemo2 object = new ThreadDemo2();
		  object.start(); }
		 */
	}
}
