package com.java.examples.loops;

public class ForLoopEx1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] names = {"Saidhar", "Nidhu", "SaiAnwita", "Nidhu"};
		
		int index = 1;
		for (String name : names) {
			System.out.println(index + ". " + name);
			index++;
		}

	}

}
