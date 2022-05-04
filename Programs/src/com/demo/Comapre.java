package com.demo;

import java.util.ArrayList;
import java.util.Collections;

public class Comapre 
{
	public static void main(String[] args) {
		
		ArrayList<lappy> list = new ArrayList<>();
		lappy la1 = new lappy();
		la1.setId(1);
		la1.setName("Dell");
		la1.setRam(8);
		lappy la2 = new lappy(3, "Accer", 2);
		lappy la3 = new lappy(2, "hp", 6);
	
		
		list.add(la1);
		list.add(la2);
		list.add(la3);
		
		
		Collections.sort(list);
//		System.out.println(list);
		for (lappy lappy : list) {
			System.out.println(lappy);
		}
	
		
		
	}

}
