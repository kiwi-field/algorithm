package shell_sort;

/**
 * @Description 希尔排序（改进后的插入排序，将数组分为多个小数组，排序每一个小数组，直到间隔为1再排序一次，从而保证整个大数组有序）
 * 比插入排序速度快的原因
 * 如果最后面的数想排到最前面，普通插入排序得和前面一个一个数比较才能挪到最前面
 * 而希尔排序不需要一个个比较就能挪到最前面，间隔比较大的时候，挪的次数比较少，间隔比较小的时候，挪的距离又比较小
 * 时间复杂度O(n的1.3次方)
 * 空间复杂度O(1)
 *
 * 通过dataChecker实验发现 2分之N 时间为7秒多  knuth序列为6秒多
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

    public static void sort(int[] a) {

        int h = 1;
        // h >数组长度3分之1 则不再计算 knuth序列
        while (h <= a.length / 3) {
            h = 3 * h + 1;
        }
        // 间隔大小
        for (int gap = h; gap > 0; gap = (gap - 1) / 3) {
            for (int i = gap; i < a.length; i++) {
                for (int j = i; j > gap - 1; j -= gap) {
                    if (a[j] < a[j - gap]) {
                        swap(a, j, j - gap);
                    }
                }
            }
        }
    }

    public static void sortTwoFenOne(int[] a) {

        // 间隔大小为2分之N
        for (int gap = a.length / 2; gap > 0; gap = gap / 2) {
            for (int i = gap; i < a.length; i++) {
                for (int j = i; j > gap - 1; j -= gap) {
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
