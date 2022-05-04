package general;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PrintingDuplicates {
	public static void main(String[] args) 
	{
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(5);
		list.add(100);
		list.add(55);
		list.add(17);
		
		List<Integer> l = list.stream().sorted().collect(Collectors.toList()); // Ascending order
		Collections.sort(l);// ascending order
		System.out.println(l);
		System.out.println(l);
		
		
		List<Integer> k = new ArrayList<>();
		k.add(10);
		k.add(55);
		k.add(17);
		k.add(5);
		k.add(100);
		k.add(25);
		k.add(77);
		System.out.println(k);
		Collections.sort(k,Collections.reverseOrder()); // Descending order
		System.out.println("K_>Descending "+k);
		Collections.reverse(k); // here understand properly 
		System.out.println("K-> Descending "+k);
		Collections.reverse(k);
		System.out.println(k);
		 
		 System.out.println(k);
		 
		 String d = "prashanth Algottu";
		 String[] split = d.split(" ");
		 for(String s: split)
		 {
			 System.out.println(s);
		 }
		 String replaceAll = d.replaceAll("\\s", "");
		 System.out.println(replaceAll);
		
		
		
	}
	

}
