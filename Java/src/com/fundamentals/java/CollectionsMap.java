package com.fundamentals.java;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class CollectionsMap {

	public static void main(String[] args) {
		Map<String,Integer> map=Map.of("Apple",10,"Banana",15,"Guava",8,"Jackfruit",18);
		System.out.println(map);
//		Set<String> keySet=map.keySet();
//		keySet.forEach(k->System.out.println(map.get(k)));
		//HashMap is neither in insertion order nor sorted order
		HashMap<String,Integer> hashMap=new HashMap<>(map);
		hashMap.put("Apple",23);
		System.out.println(hashMap);
		//LinkedHashMap maintains insertion order
		LinkedHashMap<String,Integer> linkedHashMap=new LinkedHashMap<>(map);
		System.out.println(linkedHashMap);
		//TreeMap maintains sorted order
		TreeMap<String,Integer> treehMap=new TreeMap<>(map);
		System.out.println(treehMap);
		
		String string="This is an awsome occasion. This has never happened before.";
		char[] charArray=string.toCharArray();
		Map<Character,Integer> charMap=new HashMap<>();
		for(char c:charArray) {
			Integer count=charMap.get(c);
			if(count==null)
				charMap.put(c, 1);
			else
				charMap.put(c, count+1);
		}
		System.out.println(charMap);
		String[] strArray=string.split(" ");
		Map<String,Integer> strMap=new HashMap<>();
		for(String word:strArray) {
			Integer count=strMap.get(word);
			if(count==null)
				strMap.put(word, 1);
			else
				strMap.put(word, count+1);
		}
		System.out.println(strMap);
		System.out.println(treehMap.ceilingKey("Banana")+" , "+treehMap.floorKey("Banana"));
		System.out.println(treehMap.higherKey("Banana")+" , "+treehMap.lowerKey("Banana"));
		System.out.println(treehMap.subMap("Apple", "Jackfruit"));
	}
}
