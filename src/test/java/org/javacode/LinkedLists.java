package org.javacode;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedLists {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap();

		map.put(100,"Java");
		map.put(200,"Selenium");
		map.put(300,"Maven");
		map.put(400,"DataDriven");
		map.put(500,"TestNG");
		map.put(600,"Cucumber");
		map.put(700,"API");
		map.put(800,"Postman");
		map.put(900,"RestAssured");

		Set<Entry<Integer,String>>entrySet = map.entrySet();
		for(Entry<Integer,String> entry : entrySet){
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}

	}
}
