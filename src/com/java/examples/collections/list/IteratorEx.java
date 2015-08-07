package com.java.examples.collections.list;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {

	public static void main(String[] args) {
		ArrayList<String> namesList = new ArrayList<String>();

		namesList.add("Sasidhar");
		namesList.add("BhanuPavani");
		namesList.add("SaiAnwita");
		namesList.add("Srinidhi");
		
		Iterator<String> iterator = namesList.iterator();
		while (iterator.hasNext()) {
			String name = iterator.next();
			System.out.println("Name : " + name );
		}
	}

}
