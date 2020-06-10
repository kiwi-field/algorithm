package quick_sort;

/**
 * @Description 快速排序
 * 主要思想: 在一堆数中找一个数当轴，将小于这个数的排到他的前面，前面的数递归排序，大于这个数的排到他的后面，后面的数递归排序
 * @Date 2020/6/10 10:50 https://blog.csdn.net/pengzonglu7292/article/details/84938910
 * @Author dengxiaoyu
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] a = {7, 3, 2, 8, 1, 9, 5, 4, 6,10};
//        int[] a = {4,6,8,5};
        sort(a, 0, a.length-1);
        System.out.println("-------sort结果-------");
        print(a);
    }

    public static void sort(int[] a, int leftBound, int rightBound) {
        if (leftBound >= rightBound) return;
        int mid = partition(a, leftBound, rightBound);
        sort(a, leftBound, mid - 1);
        sort(a, mid + 1, rightBound);
    }

    static int partition(int[] arr, int leftBound, int rightBound) {
        // 基数
        int pivot = arr[rightBound];
        int left = leftBound;
        int right = rightBound - 1;
        while (left <= right) {
            while (left <= right && arr[left] <= pivot) {
                left++;
            }
            while (left <= right && arr[right] > pivot) {
                right--;
            }
//            System.out.println("before swap: left->" + left + " right->" + right);
            if (left < right) {
                swap(arr, left, right);
            }
//            System.out.print("--");
//            print( arr);
//            System.out.println();
        }
        swap(arr, left, rightBound);
        return left;
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
