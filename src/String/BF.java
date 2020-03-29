package String;

/**主串n
 * 模式串m
 * BF暴力匹配算法:从起始位置0~到n-m+1个子串O(n*m)
 */
public class BF {

    public static int bf(String a, String b) {
      char[] aArr = a.toCharArray();
      char[] bArr = b.toCharArray();
        for (int i=0; i < aArr.length-bArr.length+1; ++i) {
            int k = 0;
            for (int j=0; j<bArr.length; ++j){
                //注意下标 i+k
                if (aArr[i+k] != bArr[j]) {
                    break;
                }
                ++k;
            }
            if (k == bArr.length){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String a = "aaaabbbb";
        String b = "bbbb";
        int i = bf(a,b);
        System.out.print(i);
    }
}
