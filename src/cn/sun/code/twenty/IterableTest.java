package cn.sun.code.twenty;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class IterableTest {

	public static void main(String[] args) {
		// 数据准备
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("卡卡西");
		arrayList.add("带土");

		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("卡卡西");
		linkedList.add("带土");

		HashSet<String> hashSet = new HashSet<>(arrayList);

		// 开始遍历
		Iterator<String> iterator = null;
		System.out.println("arrayList========");
		iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("linkedList========");
		iterator = linkedList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("hashSet========");
		iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
