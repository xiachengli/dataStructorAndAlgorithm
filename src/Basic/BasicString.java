package Basic;

public class BasicString {
    public static void main(String[] args) {
        String a = "aaaaaa";
        String b = "aaa"+"aaa";
        System.out.println(a == b); //true
        System.out.println(a.equals(b)); //true

        String c = new String(a);
        String d = new String(b);
        System.out.println(c == d);//false
        System.out.println(c.equals(d));//true

        System.out.println(a == c);//false
        System.out.println(a.equals(c));//true

        //String的equal比较的是值
       // == 基本数据比值 引用比地址
        //equals 引用比对象中的内容

        Integer i = new Integer(345);
        int j = 345;
        System.out.println(i.equals(j));//true

    }
}
