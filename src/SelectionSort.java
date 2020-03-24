import java.util.Arrays;

/**
 * 选择排序：比较交换，与插入不同的是，每次在未排中选取最小的值
 * 算法思想：将待排数组分为两个区间，已排和未排，每次在未排中选取最小的值在已排中找到合适的位置然后两个数交换
 * 时间复杂度：O(n^2)
 * 空间复杂度：O(1)
 * 稳定性：不稳定
 */
public class SelectionSort {
    public static int[] selectSort(int[] arr) {
        if (arr.length == 1){
            return arr;
        }
        for(int i=0; i<arr.length-1; ++i) {
          //查找最小值
            int minIndex = i;
            for (int j=i+1; j<arr.length; ++j){
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = tmp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {2,5,1,6,7,4};
        arr = selectSort(arr);
        System.out.print(Arrays.toString(arr));
    }
}
