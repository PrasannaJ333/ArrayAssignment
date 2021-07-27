package com.shristi.training;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class secondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number of elements");
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println("Enter the array elements");
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = kb.nextInt();
		int temp = 0;

		for (int i = 0; i < a.length - 1; i++)

			for (int j = 0; j < a.length - 1 - i; j++)
				if (a[j] < a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
		Set<Integer> c = new LinkedHashSet<Integer>();

		for (int i : a) {
			c.add(i);
		}
		int count = 1;
		System.out.println("Second largest element in the given array is ");
		for (int j : c) {
			if (count == 2) {
				System.out.print(j);
				break;
			}
			count++;
		}
		kb.close();

	}

}
