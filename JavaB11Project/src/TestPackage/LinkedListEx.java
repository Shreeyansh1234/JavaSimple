package TestPackage;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList<Integer> lt=new LinkedList<Integer>();
		lt.add(1);
		lt.add(5);
		lt.add(58);
		lt.add(55);
		System.out.println(lt);
		for(Integer i:lt) {
			System.out.println(i);
		}
		
	}

}
