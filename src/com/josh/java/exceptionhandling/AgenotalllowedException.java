package com.josh.java.exceptionhandling;

public class AgenNotAlllowedException extends RuntimeException {//uncheked exception extends Runtimexception
	AgenNotAlllowedException(String msg) {
		super(msg);
	}
}
