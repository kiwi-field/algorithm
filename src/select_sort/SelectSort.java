package select_sort;

/**
 * @Description 选择排序算法(每一次遍历选出最小的一个排在前面，直到排好序为止)
 * 思路2:遍历一次寻找一个最小值和最大值，最小值移动到前面，最大值移动到后面(暂未实现)
 * 思路3:每次比较的时候拿出后面2个值来比较，先取这两个值的最小值，再拿最小值和minPos比较(暂未实现)
 * 时间复杂度为O(n的平方)
 *
 * 基本不用，不稳
 * @Date 2020/5/25 9:06
 * @Author dengxiaoyu
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3, 7, 4, 6};
        // 第一次循环  5, 2, 8, 1, 3, 7, 4
        sort(arr);


    }

    public static void sort(int[] arr) {
        for (int i1 = 0; i1 < arr.length - 1; i1++) {
//            System.out.println("-----------------");
//            System.out.println("遍历第" + i1 + "次");
//            System.out.println("交换前");
//            print(arr);
            int minPos = i1;
            //第一次循环 2, 8, 1, 3, 7, 4, 6
            for (int j = i1 + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            swap(arr, i1, minPos);
//            System.out.println("最小值位置为" + minPos);
//            System.out.println("交换后");
//            print(arr);
        }
    }

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
