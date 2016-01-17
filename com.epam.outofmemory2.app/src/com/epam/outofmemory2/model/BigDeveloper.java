package com.epam.outofmemory2.model;

/*
 * Class simulates developer. 
 * Each developer has its own tester.
 */
public class BigDeveloper {
	private static final long[] CACHE_ALLOCATING_MEMORY = new long[9000000];
	
	private BigTester tester;
	
	public BigDeveloper(){
		this.tester = new BigTester();
	}
}
