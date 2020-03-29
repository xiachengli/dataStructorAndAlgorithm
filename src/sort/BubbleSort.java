package sort;

import java.util.Arrays;

/**
 * 冒泡排序：比较交换
 * 算法思想：相邻的两个数进行比较，看是否满足大小要求，每一次冒泡至少有一个元素交换到正确的位置，重复n次
 * 时间复杂度:O(n^2)
 * 内存消耗:O(1)
 * 稳定性:稳定
 */
public class BubbleSort {

   public static void bubbleSort (int[] arr){
       //边界处理
       if (arr.length == 1) {
           return ;
       }

       for (int i=0; i<arr.length; i++) {
           //哨兵
           boolean flag = false;

           for (int j=0; j<arr.length-i-1; j++) {
               if(arr[j] > arr[j+1]) {
                   int tmp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = tmp;
                   flag = true;
               }
               if (!flag) {
                   break;
               }
           }
       }
   }

    public static void main(String[] args) {
        int[] arr = {2,5,1,6,7,4};
        bubbleSort(arr);
        System.out.print(Arrays.toString(arr));
    }
}
