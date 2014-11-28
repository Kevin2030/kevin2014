package com.kevin.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NumTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		int[] array = new int[10];
		System.out.print("请输入第" + count + "个数：");
		while (scanner.hasNext()) {
			array[count] = Integer.parseInt(scanner.next());
			count++;
			if (count == 10)
				break;
			System.out.print("请输入第" + count + "个数：");
		}

		List<Integer> list = new ArrayList<Integer>();
		for (int j : array) {
			list.add(j);
		}

		Collections.sort(list, Collections.reverseOrder());

		System.out.print("所输入的数是: ");
		for (int i : list) {
			System.out.print(i + " ");
		}
		System.out.println();

	}

	/**
	 * 插入排序
	 * •思想：每步将一个待排序的记录，按其顺序码大小插入到前面已经排序的字序列的合适位置，直到全部插入排序完为止。<br>
	 * •关键问题：在前面已经排好序的序列中找到合适的插入位置。<br>
	 * •方法：<br>
	 * –直接插入排序<br>
	 * –二分插入排序<br>
	 * –希尔排序<br>
	 * @param array
	 * @author Kai.Zhao
	 * @since 1.0
	 */
	public static void insertSort(int[] array) {
		
	}

}
