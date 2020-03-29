package String;

/**
 * KMP:坏字符+好前缀O(n+m)
 * next数组：失效函数、用来存储模式串中每个前缀的最长可匹配前缀子串的结尾字符下标
 * 数组的下标是每个前缀结尾字符的下标，数组的值是这个前缀最长可匹配前缀子串的结尾字符下标
 */
public class KMP {

    public static int kmp(char[] a,char[] b) {
        int n = a.length;
        int m = b.length;

        //构建失效函数:只与模式串有关
        int[] next = getNexts(b,m);
        int i = 0;
        int j = 0;
        while (i < a.length && j < b.length){
            if (a[i] == b[j]) {
                i++;
                j++;
            }else{
                if (j != 0){
                    j = next[j-1];
                }else {
                    i++;
                }
            }
        }
        if (j == b.length) {
            return i-m;
        }
        return -1;
    }

    private static int[] getNexts(char[] b, int m) {
        int[] next = new int[b.length];
        int index = 0;
        for (int i=1; i<b.length;) {
            if (b[i] == b[index]){
                next[i] = index + 1;
                i++;
                index++;
            }else {
                if (index != 0){
                    index = next[index-1];
                }else {
                    next[i] = 0;
                    i++;
                }
            }
        }
        return next;
    }

    public static void main(String args[]){

        String text = "abcxabcdab";
        String pattern = "abcdab";
        int i = kmp(text.toCharArray(), pattern.toCharArray());
        System.out.print(i);

    }
}
