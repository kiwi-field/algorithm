package merge_sort;

/**
 * @Description 归并排序    时间复杂度O(NlogN)  空间复杂度O(n)
 * 思想：给定一个数组，需要将数组分成两半，分别将左边一半和右边一半都排好顺序以后，再进行merge,
 * merge的过程是创建一个临时数组，将左侧数组和右侧数组，每次拿出一个值比较，小的插入到临时数组中。
 * 需要注意的是如果遍历结束后，有一个数组没有遍历完，需要将其依次插入的新数组中
 * @Date 2020/6/4 9:13
 * @Author dengxiaoyu
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 8, 3, 6, 9};
        sort(arr, 0, arr.length - 1);
        System.out.println("排序后的数组");
        print(arr);
    }

    static void sort(int[] a, int left, int right) {
        // 这行不加栈溢出
        if (left == right) return;
        int mid = (left + right) / 2;
        // 左半部分排序
        sort(a, left, mid);
        // 右半部分排序
        sort(a, mid + 1, right);
        merge(a, left, mid + 1, right);
    }

    /**
     * @param a
     * @param leftPoint  左指针
     * @param rightPoint 右指针
     * @param rightBound 右边界(包含)
     */
    private static void merge(int[] a, int leftPoint, int rightPoint, int rightBound) {
        int[] tmp = new int[rightBound - leftPoint + 1];
        int mid = rightPoint - 1;
        int i = leftPoint;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j < a.length) {
            if (a[i] <= a[j]) {
                tmp[k] = a[i];
                k++;
                i++;
            } else {
                tmp[k] = a[j];
                k++;
                j++;
            }
        }

        // 如果有一个子数组还没有插入完成
        while (i <= mid) {
            tmp[k++] = a[i++];
        }

        while (j <= rightBound) {
            tmp[k++] = a[j++];
        }

        // 将tmp数组内容写回arr
        for (int n = 0; n < tmp.length; n++) {
            a[leftPoint + n] = tmp[n];
        }
    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
