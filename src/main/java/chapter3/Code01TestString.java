package chapter3;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 18:45 2019/7/28
 */
public class Code01TestString {

    public static void main(String[] args) {
        String aa = "abcdef";
        int i1 = aa.codePointAt(2);
        System.out.println(i1);

        System.out.println(aa.compareTo("abcdef"));
        System.out.println(aa.startsWith("a"));

        System.out.println("===========");
        System.out.println(aa.indexOf("c"));
        System.out.println(aa.indexOf("a"));
        System.out.println(aa.indexOf("d"));
        System.out.println(aa.indexOf("a", 0));
        System.out.println(aa.indexOf(2, 4));

        System.out.println(aa.replace("abc", "xyz"));

        System.out.println(String.join("+", "adad", "werty"));


    }


}
