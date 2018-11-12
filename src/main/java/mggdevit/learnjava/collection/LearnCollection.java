package mggdevit.learnjava.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author mgg-dev-it
 */
public abstract class LearnCollection {

	public static void learn() {
		// https://docs.oracle.com/javase/8/docs/technotes/guides/collections/index.html
		// https://docs.oracle.com/javase/8/docs/api/java/util/Collection.html
		// https://docs.oracle.com/javase/8/docs/api/java/util/List.html
		// https://docs.oracle.com/javase/8/docs/api/java/util/Set.html
		// https://docs.oracle.com/javase/8/docs/api/java/util/Queue.html
		// https://docs.oracle.com/javase/8/docs/api/java/util/Map.html
		System.out.println("");
		System.out.println("LEARNING COLLECTIONS");
		System.out.println("");
		System.out.println("List: ordered, indexed");
		System.out.println("Set: no duplicates");
		System.out.println("Queue: ordered (eg. fifo)");
		System.out.println("Map: key-value pairs (no duplicate keys)");
		System.out.println("");
		System.out.println("Common methods: add(), remove(), isEmpty(), size(), clear(), contains()");
		System.out.println("");
		System.out.println("LIST");
		System.out.println("ArrayList, LinkedList, Vector, Stack");
		System.out.println("");
		learnList();
		learnSet();
		System.out.println("");
		System.out.println("");
		System.out.println("");
	}

	private static void learnList() {
		System.out.println("");
		System.out.println("LEARNING LISTS");
		System.out.println("");
		List<String> list = new ArrayList<>();
		System.out.println("List<String> list = new ArrayList<>() : " + list.toString());
		list.add("SD");
		System.out.println("list.add(\"SD\") : " + list.toString());
		list.add(0, "NY");
		System.out.println("list.add(0, \"NY\") : " + list.toString());
		list.set(1, "FL");
		System.out.println("list.set(1, \"FL\") : " + list.toString());
		list.remove("NY");
		System.out.println("list.remove(\"NY\") : " + list.toString());
		list.remove(0);
		System.out.println("list.remove(0) : " + list.toString());

		list.add("OH");
		System.out.println("list.add(\"OH\") : " + list.toString());
		list.add("CO");
		System.out.println("list.add(\"CO\") : " + list.toString());
		list.add("NJ");
		System.out.println("list.add(\"NJ\") : " + list.toString());
		String state = list.get(0);
		System.out.println("String state = list.get(0) : " + state);
		int index = list.indexOf("NJ");
		System.out.println("int index = list.indexOf(\"NJ\") : " + index);
	}

	private static void learnSet() {
		System.out.println("");
		System.out.println("LEARNING SETS");
		System.out.println("");
		System.out.println("HashSet");
		Set<Integer> hashSet = new HashSet<>();
		System.out.println("set.add(66) " + hashSet.add(66));
		System.out.println("set.add(10) " + hashSet.add(10));
		System.out.println("set.add(66) " + hashSet.add(66));
		System.out.println("set.add(8) " + hashSet.add(8));
		for (Integer integer : hashSet) {
			System.out.print(integer + ",");
		}
		System.out.println("");
		System.out.println("");
		System.out.println("TreeSet");
		Set<Integer> treeSet = new TreeSet<>();
		System.out.println("set.add(66) " + treeSet.add(66));
		System.out.println("set.add(10) " + treeSet.add(10));
		System.out.println("set.add(66) " + treeSet.add(66));
		System.out.println("set.add(8) " + treeSet.add(8));
		for (Integer integer : treeSet) {
			System.out.print(integer + ",");
		}
	}

}
