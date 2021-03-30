package demo;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
//		ArrayList<String> arrayList = new ArrayList<>();
//		
//		System.out.println("array:" + arrayList);
//		arrayList.add("hello");
//		arrayList.add("world");
//		System.out.println("array:" + arrayList);
//		arrayList.add(1, "all");
//		System.out.println("array:" + arrayList);
//		arrayList.remove("all");
//		System.out.println("array:" + arrayList);
//		arrayList.remove(1);
//		System.out.println("array:" + arrayList);
//		arrayList.set(0, "111");
//		System.out.println("array:" + arrayList);
//		arrayList.add("222");
//		System.out.println(arrayList.get(1));
		ArrayList<String> array2 = new ArrayList<>();
		array2.add("1");
		array2.add("2");
		array2.add("3");
		for(int i=0; i<array2.size(); i++) {
			System.out.println(array2.get(i));
		}
		
	}

}
