package by.htp.arraysort;

import java.util.Random;

public class ArraySorting {

	public static void SelectionSort(int[] arr) {

		for (int min = 0; min < arr.length - 1; min++) {
			int least = min;
			for (int j = min + 1; j < arr.length; j++) {
				if (arr[j] < arr[least]) {
					least = j;
				}
			}
			int tmp = arr[min];
			arr[min] = arr[least];
			arr[least] = tmp;
		}

	}

	public static void InsertionSort(int[] arr) {
		int temp;
		int j;
		for (int i = 1; i < arr.length; i++) {
			j = i - 1;
			while ((j >= 0) && (arr[j] > arr[j + 1])) {
				temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
				j--;
			}
		}

	}

	public static void BubbleSort(int[] arr) {
		int temp;

		for (int i = 0; i < arr.length; i++) {
			for (int j = arr.length - 1; j > i; j--) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void QuickSort(int[] arr, int left, int right, Random rand) {
		int i = left;
		int j = right;
		int x = arr[left + rand.nextInt(right - left + 1)];
		while (i <= j) {
			while (arr[i] < x) {
				i++;
			}
			while (arr[j] > x) {
				j--;
			}
			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		if (left < j) {
			QuickSort(arr, left, j, rand);
		}
		if (i < right) {
			QuickSort(arr, i, right, rand);
		}
	}

}
