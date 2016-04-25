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
	
	/**
	 * this method was added in master
	 */
	public static void addedInMaster(){
		
	}
	
	/**
	 * we are going to push this back to master
	 */
	private static void addedInBranchGoingToMaster(){
		
	}
	
	/**
	 * going back to branch
	 */
	private static void goingDownToBranch(){
		
	}
}
