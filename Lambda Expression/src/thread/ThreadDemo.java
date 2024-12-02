package thread;

public interface ThreadDemo {
	
	public static void main(String[] args) {
		
		// first thread : Thread JOHN
		
//		Runnable thread1 = () ->{
//			// this is body of the thread
//			// stuff
//			for(int i=1; i<=10; i++) {
//				System.out.println("Value of i is "+i);
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			}
//		};
//		Thread thread = new Thread(thread1);
//		thread.setName("JOHN");
//		thread.start();
//		
		
		// second thread
		Runnable t = () -> {
			try {
				
				for(int i=1; i<=10; i++) {
					System.out.println(i*2);
					Thread.sleep(2000);
				}
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};
		
		Thread thread = new Thread(t);
		thread.start();
 	}

}
