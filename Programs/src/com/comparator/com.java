package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



public class com 
{
	public static void main(String[] args) {
		
		ArrayList<lappy1> list = new ArrayList<>();
		lappy1 la1 = new lappy1();
		la1.setId(1);
		la1.setName("Dell");
		la1.setRam(8);
		
		lappy1 la2 = new lappy1(2, "hp", 6);
		lappy1 la3 = new lappy1(3, "Accer", 2);	
		
		list.add(la1);
		list.add(la2);
		list.add(la3);
		
		
		Comparator<lappy1> com = new Comparator<lappy1>() {

			@Override
			public int compare(lappy1 o1, lappy1 o2) {
				return(o1.getId()-o2.getId());
				
				
			}
			
		};
		Collections.sort(list,com);
		for (lappy1 lappy : list) {
			System.out.println(lappy);
		}
		
		
		  	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
