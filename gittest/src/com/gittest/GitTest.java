package com.gittest;

public class GitTest {

	/**
	 * adding mor comments here - hot fix
	 * @param args
	 */
	public static void main(String[] args) {
		testMethod();
		System.out.println("This is our test");
		anotherMethod();
	}

	public static void testMethod(){
		System.out.println("this is another branch we are testing");
	}
	
	public static void anotherMethod(){
		System.out.println("we have the another method here");
	}
}
