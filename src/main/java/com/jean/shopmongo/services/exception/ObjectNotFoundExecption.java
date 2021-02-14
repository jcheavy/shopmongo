package com.jean.shopmongo.services.exception;

public class ObjectNotFoundExecption extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public ObjectNotFoundExecption(String msg) {
		super(msg);
	}

}
