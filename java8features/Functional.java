package com.josh.java.java8features;

@FunctionalInterface
interface Interf {

	default void method1() {
		System.out.println("This is Default method!!!");
	}

	public abstract void method2(String str);
}

public class Functional implements Interf {
	public void method2(String str) {
		System.out.println("The string in method 2 is : " + str);
	}

	public static void main(String[] args) {
		Functional obj = new Functional();

		obj.method1();

		obj.method2("This is abstract method");
	}

}
