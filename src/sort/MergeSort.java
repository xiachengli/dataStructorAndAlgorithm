package sort;

import org.w3c.dom.html.HTMLParagraphElement;

import java.util.Arrays;

/**
 * 归并排序：分而治之
 * 算法思想：把待排数组从中间分为两部分，然后对两部分分别排序，最后合并有序数组merge(p...r) = merge(p...q) + merge(q+1...r)
 * 时间复杂度：O(nlogn)
 * 空间复杂度：O(n)只要是对两个有序数组排序
 * 稳定性：稳定
 */
public class MergeSort {

    public static void mergeSort(int[] arr,int left,int right) {
        //直至只剩一个元素
        if (left < right) {
            int middle = left + (right - left)/2;
            //递归
            mergeSort(arr,left,middle);
            mergeSort(arr,middle+1,right);

            //合并有序数组
           merge(arr,left,middle,right);
        }
    }

    private static void merge(int[] arr, int left, int middle, int right) {
        int i = left;
        int j = middle + 1;
        int k = 0;
        int[] a = new int[arr.length];
        while (i <= middle && j <= right){
            if (arr[i] >= arr[j]) {
                a[k++] = arr[j++];
            }else {
                a[k++] = arr[i++];
            }
        }
        while (i <= middle){
            a[k++] = arr[i++];
        }
        while (j <= right) {
            a[k++] = arr[j++];
        }
        //这里别忘了
        for (i=0 ; i<=right-left;++i){
            arr[left+i] = a[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,5,3,6,7,4};
        mergeSort(arr,0,arr.length-1);
        System.out.print(Arrays.toString(arr));
    }
}
