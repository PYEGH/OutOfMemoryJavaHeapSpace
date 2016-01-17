package com.epam.outofmemory2.model;

/*
 * Class simulates tester. 
 * Each tester has its own developer.
 */
public class BigTester {
	private static final long[] CACHE_ALLOCATING_MEMORY = new long[9000000];
	
	private BigDeveloper developer;
	
	public BigTester(){
		this.developer = new BigDeveloper();
	}
}
