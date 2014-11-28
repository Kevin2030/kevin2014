package com.kevin.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionDemo {

	public static void main(String[] args) {

	}

	public static void testSet() {
		Set<Integer> set = new HashSet<Integer>();
		set.add(12);

	}

	public static void testList() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.removeAll(Collections.singleton(null));
		List<Integer> link = new LinkedList<Integer>();
		link.add(12);
	}

	public static void testMap() {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(12, 12);
	}
	
	public static void differentBetweenHashMapAndHashTable() {
		
	}

}
