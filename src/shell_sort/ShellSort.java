package shell_sort;

/**
 * @Description 希尔排序
 * @Date 2020/6/3 10:09
 * @Author dengxiaoyu
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] a = {9, 3, 1, 4, 6, 8, 7, 5, 2};
        sort(a);
        System.out.println("-------sort结果-------");
        print(a);
    }

    static void sort(int[] a) {

        int h = 1;
        // h >数组长度3分之1 则不再计算 knuth序列
        while (h <= a.length / 3) {
            h += 3 * h + 1;
        }
        // 间隔大小
        for (int gap = h; gap > 0; gap = (gap - 1) / 3) {
            for (int i = 1; i < a.length; i++) {
                for (int j = i; j >= gap; j -= gap) {
                    if (a[j] < a[j - gap]) {
                        swap(a, j, j - gap);
                    }
                }
            }
        }
    }

    /**
     * 交换两个位置的数
     */
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
