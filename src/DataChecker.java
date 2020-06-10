import shell_sort.ShellSort;

import java.util.Arrays;
import java.util.Random;

/**
 * 对数器，校验排序算法正确性
 */
public class DataChecker {

	static int[] generateRandomArray() {
		Random r = new Random();

		int[] arr = new int[100];

		for (int i = 0; i < arr.length; i++)
			arr[i] = r.nextInt(10000);

		return arr;
	}

	static void check() {
		boolean same = true;
		for(int times = 0; times < 100; times++) {
			int[] arr = generateRandomArray();
			int[] arr2 = new int[arr.length];
			System.arraycopy(arr, 0, arr2, 0, arr.length);

			Arrays.sort(arr);
//			OptimizedBubbleSort.sort(arr2);
//			BubbleSort.sort(arr2);
//			InsertSort.sort(arr2);
			// 希尔排序不对
			ShellSort.sort(arr2);
//			SelectSort.sort(arr2);
//			MergeSort.sort(arr2, 0, arr2.length-1);
//			QuickSort.sort(arr2, 0, arr2.length-1);


			for (int i = 0; i < arr2.length; i++) {
				if(arr[i] != arr2[i]) same = false;
			}
		}
		System.out.println(same == true ? "right" : "wrong");

	}

	public static void main(String[] args) {
		check();
	}

}
