package by.htp.arraysort;

import java.util.Random;

public class SortTest {
	public static void main(String[] args) {
		Random rand = new Random();
		int[] arr = new int[20];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(50);
		}

		printArray(arr);
		// ArraySorting.selectionSort(arr);
		// ArraySorting.insertionSort(arr);
		// ArraySorting.bubbleSort(arr);
		ArraySorting.quickSort(arr, 0, 19, rand);

		System.out.println("Sorted:");
		printArray(arr);
	}

	public static void printArray(int[] arr) {
		for (int j = 0; j < arr.length; j++) {
			System.out.println("[" + j + "] = " + arr[j]);
		}
	}

}
