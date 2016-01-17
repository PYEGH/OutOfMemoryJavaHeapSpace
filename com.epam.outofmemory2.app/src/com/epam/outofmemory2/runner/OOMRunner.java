package com.epam.outofmemory2.runner;

import com.epam.outofmemory2.model.BigDeveloper;

/**
 * Class generates java.lang.OutOfMemoryError: Java heap space without using of
 * arrays/collections and continuously creates big objects.
 * Parameters which are necessary for java.lang.OutOfMemoryError: Java heap space:
 * 
 * -Xmx3m -Xss15m
 * 
 * @author Pavel
 * 
 */
public class OOMRunner {

	public static void main(String[] args) {

		BigDeveloper developer = new BigDeveloper();
		System.out.println("The End.");
	}
}
