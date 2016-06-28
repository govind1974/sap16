package com.sapient.beans;

public class Bank implements Offline,Agent{

	public double bal = 50000;
	@Override
	public void withdraw() {
		System.out.println("withdraw");
		
	}

	@Override
	public void getBalance() {
		System.out.println("get balance");
		
	}

	@Override
	public void clearPdc() {
		System.out.println("clear pdc");
		
	}

	@Override
	public void deposit() {
		System.out.println("deposit");
		
	}

}
