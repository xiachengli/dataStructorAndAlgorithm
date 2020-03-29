package sort;

import java.util.Arrays;

/**
 * 快排：跟分治一样采用分治思想，不同的是快排注重于分，在待排数据中选取一个分区点，从左到右遍历数据，将小于分区点的放在左边，将大于分区点的
 * 放在右边，将分区点放在中间，重复直至数据有序
 */
public class QuickSort {

    public static void quickSort(int[] arr, int left, int right) {
       if (left < right) {
           int p = partition(arr,left,right);
           quickSort(arr,left,p-1);
           quickSort(arr,p+1,right);
       }
    }

    private static int partition(int[] arr, int left, int right) {
        //一般选取元素最后一个元素为分区点
        int p = arr[right];
        int i = left;
        for (int j = left; j < right; ++j){
            if (arr[j] < p){
                if (i == j) {
                    ++i;
                }else {
                    //处理技巧：数组插入会涉及数据搬移，所以这里采用“交换”（小的慢慢往前移动，大的一步一步后退）
                    int tmp = arr[i];
                    arr[i++] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        //将分区点放到合适位置
        int tmp = arr[i];
        arr[i] = arr[right];
        arr[right] = tmp;
        return i;
    }

    public static void main(String[] args) {
        int[] arr = {2,5,3,6,7,4};
        quickSort(arr,0,arr.length-1);
        System.out.print(Arrays.toString(arr));
    }
}
