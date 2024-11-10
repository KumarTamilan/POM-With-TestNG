package org.javacode;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Collectionsss {

	public static void main(String[] args) {
		
		// 1.How to add the Value in List ?
		// -List support Multiple null value
		// -Set support only one null.
//		List<Object> list = new ArrayList();
//		list.add(10);
//		list.add(8362576353888475l);
//		list.add(7456.7845367324f);
//		list.add("Java");
//		list.add(74564);
//		list.add(78364654765d);
//		list.add('A');
//		list.add(true);
//		list.add(null);
//		list.add(null);
//		
//		System.out.println(list);

		// 4..How to TreeSet performed?
		// -TreeSet not allow even single null.
		// -It will print in Ascending Order.
		// 5.How to come ClasscastException ?
		// -when we are give more than one DataType
		// the it will throw the ClassCastException.
		// So TreeSet is support only similar DataType.
//		Set set = new TreeSet();
//		
//		set.add(10);
//		set.add(83625);
//		set.add(7456);
//		set.add(64536);
//		set.add(74564);
//		set.add(783);
//		set.add(645);
//		set.add(4354);
//		set.add(6345);
//		set.add(645);
//		
//		System.out.println(set);

//		ArrayList<Integer> list = new ArrayList();		//==>Similar DataType
//		ArrayList<Object>list1 = new ArrayList();		//==>DisimilarDataType
//		
//		Set<Integer>set = new HashSet();					//==>Similar DataType
//		Set<Object>set1 = new HashSet();					//==>DisimilarDataType
//		
//		Map<Integer,Character>map = new HashMap();	//==>Key & Value pair only
//		Map<Object>map1 = new HashMap();			//Map does not support disimilar DataType

		// 6.What is mean Like List is a index based ?
		// and Set is a value based ?
		// BECAUSE :
		// -List is index based.So we can easily modify
		// index.and update the index.
		// -But Set is not allowed to modify the index,
		// because Set is value based.
		// -So we can't modify and update.
//		ArrayList list = new ArrayList();
//		
//		list.add(45);
//		list.add(45);
//		list.add(45);
//		list.add(45);
//		System.out.println(list);
//		list.add(3,"Java");
//		System.out.println(list);
//		
//		Set set = new HashSet();
//		list.add(3,"Java");	//====>List provides
//		set.add("Java");		//====>Set provides

		// 9.How to perform set mehod in List ?
		// add->To add the value
		// remove->To remove particular index.
		// removeAll->To remove all Index value.
		// set-> particular index value will be updated.
//		ArrayList list = new ArrayList();
//		LinkedList list1 = new LinkedList();
//		
//		list.add(45);
//		list.add(35);
//		list.add(25);
//		list.add(15);
//		
//		System.out.println("Befare List size : "+list.size());
//		System.out.println("Before List : "+list);
//		
//		list.set(2, 100);
//		
//		System.out.println("After List : "+list);
//		System.out.println("After List size : "+list.size());

		// LIST METHODS
		// add-> -To add the value
		// addAll-> -to copy the value From one List To another List.
		// size-> -given to total length of the size.
		// remove-> -To remove particular index.
		// Remove Method is used to deletion is easy.
		// removeAll->-To remove all Index value.
		// retainAll-> -To check The two list,Like which value is present in
		// both List.
		// set-> -particular index value will be updated.
		// get--> -To pass the index and get the particular value.
		// indexOf-> -To pass the value and get the particular index.
		// contains-> -To check the given value is present OR not.
		// clear-> -To clear the all values in the List.

		
		
		
		
		
		
		
		
		
		
		// 52.How to perform ADD &,REMOVE Method in List ?
		// LIST METHODS

//		ArrayList list = new ArrayList();
//
//		list.add(10);
//		list.add(8362576353888475l);
//		list.add(7456.7845367324f);
//		list.add("Java");
//		list.add(74564);
//		list.add(78364654765d);
//		list.add('A');
//		list.add(true);
//		list.add(null);
//		list.add(null);
//
//		System.out.println(list);
//
//		list.remove(2);
//
//		System.out.println(list);

		// 53.How to perform size,get Method in List ?
		// LIST METHODS
//		ArrayList list1 = new ArrayList();
//
//		list1.add(10);
//		list1.add(8362576353888475l);
//		list1.add(7456.7845367324f);
//		list1.add("Java");
//		list1.add(74564);
//		list1.add(78364654765d);
//		list1.add('A');
//		list1.add(true);
//		list1.add(null);
//		list1.add(null);
//		
//		Object object = list1.get(3);
//		System.out.println("GET method : "+object);
//
//		System.out.println("Total Length : "+list1.size());

//
//		// 54.How to perform set mehod in List ?
//
//		ArrayList list2 = new ArrayList();
//
//		list2.add(45);
//		list2.add(35);
//		list2.add(25);
//		list2.add(15);
//
//		System.out.println("Befare List size : " + list2.size());
//		System.out.println("Before List : " + list2);
//
//		list2.set(2, 100);
//
//		System.out.println("After List : " + list2);
//		System.out.println("After List size : " + list2.size());
//
//		

//		// 55.How to iterate the all value in List ?	
//		// 56.How to perform indexOf ?
//		// 			LIST METHODS
//		ArrayList list3 = new ArrayList();
//
//		list3.add(10);
//		list3.add(8362576353888475l);
//		list3.add(7456.7845367324f);
//		list3.add("Java");
//		list3.add(74564);
//		list3.add(78364654765d);
//		list3.add('A');
//		list3.add(true);
//		list3.add(null);
//		list3.add(null);
//		
//		int size = list3.size();
//		System.out.println("Using For loop : ");
//		for(int i=0; i<list3.size(); i++) {
//			System.out.println(list3.get(i));
//		}
//				//[OR]
//		System.out.println("Using ForEach loop : ");
//		for(Object aa : list3) {
//			System.out.println(aa);
//		}
//		Object obj = list3.indexOf("Java");
//		System.out.println("indexOf : "+obj);

//		// 57.How to perform contains ?	

//		ArrayList list4 = new ArrayList();
//
//		list4.add(10);
//		list4.add(8362576353888475l);
//		list4.add(7456.7845367324f);
//		list4.add("Java");
//		list4.add(74564);
//		
//		boolean contain = list4.contains("Java");
//		System.out.println("Given value is present OR not : "+contain); 

//		// 58.How to perform addAll ?	
//		//		How to copy the value From one List To another List ?

//		ArrayList list5 = new ArrayList();
//		ArrayList list6 = new ArrayList();
//
//		list5.add(10);
//		list5.add(8362576353888475l);
//		list5.add(7456.7845367324f);
//		list5.add("Java");
//		list5.add(74564);
//		
//		list6.add(500);
//		list6.add(510);
//		
//		list5.addAll(list6);
//		System.out.println(list5);
//		

//		// 59.How to perform retainAll ?
//		ArrayList list5 = new ArrayList();
//		ArrayList list6 = new ArrayList();
//
//		list5.add(10);
//		list5.add(8362576353888475l);
//		list5.add(7456.7845367324f);
//		list5.add("Java");
//		list5.add(74564);
//		
//		System.out.println("Before List : "+list5);
//		
//		list6.add(500);
//		list6.add(510);
//		
//		list5.addAll(list6);
//		
//		System.out.println("After List : "+list5);
//		
//		list5.retainAll(list6);
//		System.out.println("retainAll : "+list5);
//		
//		// 60.How to perform clear ?
//		System.out.println(" Before Clear List : "+list5);
//		list5.clear();
//		System.out.println("After Clear List : "+list5);
//		System.out.println("List6 : "+list6);
//		

		// 61.How to perform add method ?
		// SET METHODS :
//		Set set = new HashSet();
//		Set set1 = new HashSet();
//
//		set.add("Java");
//		set.add(10);
//		set.add(8362);
//		set.add(7456);
//		set.add(74564);
//		set.add(783);
//		set1.add(500);
//		set1.add(600);
//
//		// How to print all Values ?
//		System.out.println(set);
//
//		// How to get Total length ?
//		System.out.println("SIZE Method : " + set.size());
//
//		set.addAll(set1);
//
//		boolean contains = set.contains(set1);
//		System.out.println("CONTAINS : " + contains);
//
//		set.remove("Java");
//		System.out.println(set);
		
		
		
		
		

		// MAP
		// PUT->It is used to to insert the value
		// SIZE->It will return to total length.
		// GET->We will give the Key then it will return to value.
		// KEYSET->It will return to set of Key only.
		// VALUES->It will return to value only in given Key & value set.
		// CONTAINSKEY->It will check the given Key is present OR not.
		// CONTAINSVALUE->It will check the given value is
		// present OR not.
		// ENTRYSET->If we are using EntrySet then only we can change
		// List to SET.Then Only we can iterate the Key &
		// value for separate separate.

		
		
		
		
		
		
		
		// 81.How to perform PUT method in Map ?
		// MAP
//		Map<Integer,String> map = new LinkedHashMap();
//		
//		map.put(10,"Java");
//		map.put(20,"Selenium");
//		map.put(30,"Manual");
//		map.put(30,"Maven");
//		map.put(50,"Maven");
//		map.put(60,"Testng");
//		
//		//82.How to print all Key & value in Map ?
//		System.out.println(map);

//		//83.How to perform SIZE method in Map ?
//		System.out.println("Total length : "+map.size());
//		
//		//84.How to perform GET method in Map ?
//		String m = map.get(20);
//		System.out.println(m);
//		
//		//85.How to perform KEYSET method in Map ?
//		Set<Integer> keySet = map.keySet();
//		System.out.println(keySet.size());
//		System.out.println(keySet);
//		
//		//86.How to perform VALUES method in Map ?
//		Collection<String> values = map.values();
//		System.out.println(values);
//		

//		
//Map<Integer,String> map = new LinkedHashMap();
//		
//		map.put(10,"Java");
//		map.put(20,"Selenium");
//		map.put(30,"Manual");
//		map.put(30,"Maven");
//		map.put(50,"Maven");
//		map.put(60,"Testng");
//		
//		//87.How to perform CONTAINSKEY method in Map ?
//		boolean con = map.containsKey(30);
//		System.out.println(con);
//		
//		//88.How to perform CONTAINSVALUE method in Map ?
//		boolean conva = map.containsValue("Manual");
//		System.out.println(conva);
//		
//		//89.How to perform ENTRYSET method in Map ?
//		Set<Entry<Integer,String>> entry = map.entrySet();
//		System.out.println(entry);
//		
//		//90.How to print all Key & value in Map ?
//		for(Entry<Integer,String> entrySet : entry) {
//			System.out.println(entrySet.getKey());
//			System.out.println(entrySet.getValue());
//		}
	}
}
