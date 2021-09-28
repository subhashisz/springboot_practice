package com.myapp.exception;

public class CustomeException extends Exception {

	private static final long serialVersionUID = 1L;

	public CustomeException() {
		super();
	}

	public CustomeException(String message) {
		super(message);
	}

	public CustomeException(String message, Throwable cause) {
		super(message, cause);
	}

	public CustomeException(Throwable cause) {
		super(cause);
	}

	protected CustomeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
