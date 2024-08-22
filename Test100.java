

class Test100 {

	public static void main(String[] args) {
		Test test = new Test();
		
		Thread t1 =new Thread(test,"aa");
		t1.start();
		Thread t2 =new Thread(test,"bb");
		t2.start();
//		t1.no;
		Thread t3 =new Thread(test,"cc");
		t3.start();
	}
}
