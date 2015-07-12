package com.java.examples.loops;

public class WhileLoopEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int numbers[] = {1, 2, 4, 5, 6};
		
		int length = numbers.length;
		int index = 0;
		
		while(index < length){
			System.out.println(numbers[index]);
			index++;
		}
	}

}
