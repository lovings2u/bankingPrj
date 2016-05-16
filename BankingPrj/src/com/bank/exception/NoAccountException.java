package com.bank.exception;

public class NoAccountException extends Exception {
	public NoAccountException() {
		
	}
	public NoAccountException(String msg) {
		super(msg);
	}
}
