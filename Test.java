class Test implements Runnable {
	public synchronized void notes() {
		this.notify();
	}
	@Override
	public synchronized void run() {
		for (int i = 0; i < 100; i++) {
			
			System.out.println("hihi" + Thread.currentThread().getName() + " -- " + i);
			if (i==50) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} 
		}
		
	}
}