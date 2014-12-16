package com.gittest;

public class GitTest {

	public static void main(String[] args) {
		testMethod();
		System.out.println("This is our test");
		anotherMethod();
		// some more comments here
		// and more comments now 
	}

	public static void testMethod(){
		System.out.println("this is another branch we are testing");
	}
	
	public static void anotherMethod(){
		System.out.println("we have the another method here");
	}
	
	/**
	 * comments for this stuff
	 */
	public static void fromAnotherFeature(){
		System.out.println("working on another feature");
	}
}
