package com.MultiThreading;

class BankAccount{
	private int balance = 1000;
	
	public synchronized void deposit(int amount) {
		
		int newbalance=balance+amount;
		
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		balance = newbalance;
	}
	
	public int getBalance() {
		return balance;
	}
}

class DepositTask extends Thread{
	private BankAccount account;
	
	public DepositTask(BankAccount account) {
		this.account=account;
	}
	
	public void run() {
		for(int i=1; i<=100; i++) {
			account.deposit(1);
		}
	}
}

public class SyncronizationDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		BankAccount account = new BankAccount();
		DepositTask t1 = new DepositTask(account);
		DepositTask t2 = new DepositTask(account);
		DepositTask t3 = new DepositTask(account);
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		
		System.out.println("Final Balance = "+account.getBalance());

	}

}
