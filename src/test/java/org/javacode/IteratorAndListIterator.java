package org.javacode;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class IteratorAndListIterator {

	//10.How to iterate the TreeMap using 
	//		ForEach Loop with EntrySet ? 
	public static void iterateTheTreeMap() {
		TreeMap<Integer,Character> map = new TreeMap();
		map.put(100,'S');
		map.put(200,'J');
		map.put(300,'M');
		map.put(400,'D');
		map.put(500,'T');
		map.put(600,'C');
		map.put(700,'A');
		
		System.out.println(map);
		
		System.out.println();
		
		Set<Entry<Integer,Character>>entrySet =map.entrySet();
		for(Entry<Integer,Character> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		

		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	// 4.How to iterate the Vector using
	// ENUMERATION ?
	// Enumeration is directly performed by REVERSE in the
	// VECTOR Only.
//	public static void iterateTheVectorUsingEnumeration() {
//		Vector vector = new Vector();
//		
//		vector.add(122);
//		vector.add(6453);
//		vector.add(7465);
//		vector.add(9578608912l);
//		vector.add(64536.645f);
//		vector.add(764574654839d);
//		vector.add('A');
//		vector.add(true);
//		vector.add("Java");
//		
//		System.out.println("Enumeration is "
//	+ "Directly performed by Reverse : ");
//		System.out.println();
//		Enumeration el = vector.elements();
//		while(el.hasMoreElements()) {
//			System.out.println(el.nextElement());
//		}
//	}

//	// 3.How to iterate the LinkedList using For Loop ? 
//		public static void iteratorUsingLinkedList() {
//			java.util.LinkedList<Integer> list = new java.util.LinkedList<Integer>();
//
//			
//			list.add(10);
//			list.add(836);
//			list.add(7456);
//			list.add(6354);
//			list.add(74564);
//			list.add(7836);
//			list.add(6354);
//
//			Iterator<Object> iter = list.iterator();
//			while (iter.hasNext()) {
//				System.out.println(iter.next());
//			}
//			System.out.println();
//		}
//
//	// 3.How to perform Iterator in Set?
//	// NOTE : Iterator does not support MAP.
//	public static void iteratorUsingSet() {
//		Set<Object> set = new LinkedHashSet();
//
//		set.add(10);
//		set.add(8362576);
//		set.add(7456.784);
//		set.add("Java");
//		set.add(74564);
//		set.add(78364654765d);
//		set.add('A');
//
//		Iterator<Object> iter = set.iterator();
//		while (iter.hasNext()) {
//			System.out.println(iter.next());
//		}
//		System.out.println();
//	}
//
//	// 4.How to perform List Iterator in List?
//	public static void listIteratorUsingList() {
//		ArrayList<Object> list = new ArrayList<Object>();
//
//		list.add(10);
//		list.add(8362576);
//		list.add(7456.784);
//		list.add("Java");
//		list.add(74564);
//		list.add(78364654765d);
//		list.add('A');
//
//		ListIterator<Object> iter = list.listIterator();
//		while (iter.hasNext()) {
//			System.out.println(iter.next());
//		}
//		System.out.println();
//		while (iter.hasPrevious()) {
//			System.out.println(iter.previous());
//		}
//	}
//
//	// 5.How to iterate the ArrayList using Forloop ?
//	// For loop only using for List.
//	public static void iterateTheArrayListUsingForloop() {
//		ArrayList<Object> list = new ArrayList<Object>();
//
//		list.add(10);
//		list.add(8362576);
//		list.add(7456.784);
//		list.add("Java");
//		list.add(74564);
//		list.add(78364654765d);
//		list.add('A');
//
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//	}
//
//	// How to iterate the Set Using ForEach ?
//	public static void iterateTheSetUsingForEach() {
//		Set<Object> set = new LinkedHashSet();
//
//		set.add(10);
//		set.add(8362576);
//		set.add(7456.784);
//		set.add("Java");
//		set.add(74564);
//		set.add(78364654765d);
//		set.add('A');
//
//		for (Object aa : set) {
//			System.out.println(aa);
//		}
//	}
//
//	// How to iterate the Map Using ForEach ?
//	public static void iterateTheMapUsingForEach() {
//		Map<Integer,String> map = new LinkedHashMap();
//		
//		map.put(10,"Java");
//		map.put(20,"Selenium");
//		map.put(30,"Manual");
//		map.put(30,"Maven");
//		map.put(50,"Maven");
//		map.put(60,"Testng");
//		
//		System.out.println(map);
//					//[OR]
//		Set<Entry<Integer,String>> entrySet = map.entrySet();
//		for(Entry<Integer,String> ss : entrySet) {
//			System.out.println(ss.getKey());
//			System.out.println(ss.getValue());
//		}
//	}

	public static void main(String[] args) {

		iterateTheTreeMap();
	}
}
