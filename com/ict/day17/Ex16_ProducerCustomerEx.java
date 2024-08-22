package com.ict.day17;

public class Ex16_ProducerCustomerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex16_Car c = new Ex16_Car();
		Ex16_Producer producer = new Ex16_Producer(c);
		Thread tProducer = new Thread(producer);
		Ex16_Customer customer = new Ex16_Customer(c);
		Thread tCustomer = new Thread (customer);
		tProducer.start();
		tCustomer.start();
	}

}
