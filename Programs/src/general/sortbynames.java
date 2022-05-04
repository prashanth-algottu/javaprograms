package general;

import java.util.ArrayList;
import java.util.Collections;

public class sortbynames 
{
	public static void main(String[] args) {
	
		ArrayList<String> list = new ArrayList<>();
		list.add("chinnu");
		list.add("prashanth");
		list.add("shubham");
		list.add("rakesh");
		list.add("adhi");
		
		Collections.sort(list);
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println();
		Collections.reverse(list);
		list.forEach(i->System.out.println(i));
		
	}

}
