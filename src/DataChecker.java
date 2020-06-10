import quick_sort.QuickSort;
import shell_sort.ShellSort;

import java.util.Arrays;
import java.util.Random;

/**
 * 对数器，校验排序算法正确性
 */
public class DataChecker {

	static int[] generateRandomArray() {
		Random r = new Random();

		int[] arr = new int[1000];

		for (int i = 0; i < arr.length; i++)
			arr[i] = r.nextInt(1000);

		return arr;
	}

	static void check() {
		long start = System.currentTimeMillis();
		System.out.println("开始时间:"+start);
		boolean same = true;
		for(int times = 0; times < 1000; times++) {
			int[] arr = generateRandomArray();
			int[] arr2 = new int[arr.length];
			System.arraycopy(arr, 0, arr2, 0, arr.length);

			Arrays.sort(arr);
//			OptimizedBubbleSort.sort(arr2);
//			BubbleSort.sort(arr2);
//			InsertSort.sort(arr2);
//			ShellSort.sort(arr2);
//			SelectSort.sort(arr2);
//			MergeSort.sort(arr2, 0, arr2.length-1);
			QuickSort.sort(arr2, 0, arr2.length-1);


			for (int i = 0; i < arr2.length; i++) {
				if(arr[i] != arr2[i]) same = false;
			}
		}
		System.out.println(same == true ? "right" : "wrong");
		long end = System.currentTimeMillis();
		System.out.println("结束时间"+end);
		System.out.println("消耗时间"+(end - start)+ "毫秒");

	}

	public static void main(String[] args) {
		check();
	}

}
