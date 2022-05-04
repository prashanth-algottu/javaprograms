package general;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromAList 
{
	public static void main(String[] args) {
		// 1st Way
		List l = Arrays.asList(10,20,40,4,10,4);
		List<Object> newlist = new ArrayList<>();
		
		for(Object o : l)
		{
			if(!newlist.contains(o))
			{
				newlist.add(o);
			}
		}
		System.out.println(l);
		System.out.println(newlist);

		
		// 2nd Way -------------------------------------------
		
		List l1 = Arrays.asList(22,20,40,44,22,44,55,44,55);
		Object collect = l1.stream().distinct().collect(Collectors.toList());
		System.out.println(l1);
		System.out.println(collect);
		
		
		// 3rd Way -------------------------------------------
		
		List<Integer> l2 = Arrays.asList(22,20,40,44,22,44,55,44,55);
		Set<Integer> hashSet = new HashSet<>();
		hashSet.addAll(l2);
		System.out.println(l2);
		System.out.println(hashSet);
		
		// 4th Way ----------------------------------------------------------------
		List<Integer> l3 = Arrays.asList(22,20,40,44,22,44,55,44,55);
		System.out.println(l3);
		Set<Integer> collect2 = l3.stream().collect(Collectors.toSet());
		System.out.println(collect2);
		
		
		//--------------------------------------------------------------------------
		
		
//		String trim = s.trim();
//		System.out.println(trim);
		// split over space
		String s = " prash anth al go ttu";
		String[] split = s.split(" ");
		for(String d : split)
		{
			System.out.println(d);
		}
		
		// removing spaces -------------------------------------------
		String replaceAll = s.replaceAll("\s", "");
		System.out.println(replaceAll);
		
		// trim is to remove spaces on the front
		String s1 = "                    prash anth al go ttusadxas";
		s1= s1.trim();
		System.out.println(s1);
		
		
		
		
		
		
		
		
	}
	
}
