import java.util.Arrays;

/**
 * 插入排序：比较移动
 * 算法思想：将待排数组的数据分为两个区间，已排区间和未排区间，每次从未排区间取出一个数，在已排区间找到插入的位置
 * 时间复杂度：O(n^2)
 * 空间复杂度：O(1)
 * 稳定性：稳定
 */
public class InsertionSort {

    public static int[] insertSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        for (int i=1; i<arr.length; ++i) {
            int tmp = arr[i];
            int j = i-1;
            for (; j>=0; --j) {
                if (arr[j] > tmp) {
                    arr[j+1] = arr[j];
                }else {
                    break;
                }
            }
            //不要写成arr[j++]
            arr[++j] = tmp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {2,5,1,6,7,4};
        arr = insertSort(arr);
        System.out.print(Arrays.toString(arr));
    }
}
