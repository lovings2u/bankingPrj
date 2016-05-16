package com.bank.exception;

public class OverdraftAmountException extends Exception {
	private double deficit;
	public OverdraftAmountException() {
		
	}
	public OverdraftAmountException(String msg, double amt) {
		super(msg);
		this.deficit = amt;
	}
	public double getDeficit() {
		return this.deficit; 
	}
}
