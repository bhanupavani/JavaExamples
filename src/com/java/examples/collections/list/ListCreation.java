package com.java.examples.collections.list;

import java.util.ArrayList;

public class ListCreation {

	public static void main(String[] args) {
		ArrayList<String> namesList = new ArrayList<String>();
		
		namesList.add("Sasidhar");
		namesList.add("BhanuPavani");
		namesList.add("SaiAnwita");
		namesList.add("Srinidhi");

		int index = 1;
		for (String name : namesList) {
			System.out.println(index + ". " + name);
			index++;
		}
	}

}
