package org.capg.app;

public class CmdLineSorted {
	public static void main(String[] args) {
		int n = args.length;
		int arr[];
		arr = new int[n];
		for (int k = 0; k < n; k++) {
			arr[k] = Integer.parseInt(args[k]);
		}

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] > arr[j]) {
					int a = arr[i];
					arr[i] = arr[j];
					arr[j] = a;

				}
			}
		}
		System.out.println("the sorted elements are:");
		for (int i = 0; i < n; i++) {
			System.out.println( arr[i]);
		}
	}
}