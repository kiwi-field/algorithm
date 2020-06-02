package insert_sort;

/**
 * @Description 插入排序,平均时间复杂度 O(n的平方), 最好时间复杂度O(n)
 *
 * 比如有3张牌 8 J Q,现在要插入一个10，就需要将Q和J向后移动一位，再插入
 * 样本小且基本有序的时候效率比较高
 * @Date 2020/5/29 18:15
 * @Author dengxiaoyu
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] a = {9, 3, 1, 4, 6, 8, 7, 5, 2};
        sort(a);
        System.out.println("-------sort结果-------");
        print(a);
    }

    static void sort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                if (a[j] < a[j - 1]) {
                    swap(a, j, j - 1);
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
