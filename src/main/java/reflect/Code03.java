package reflect;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Author: jiangjiabin
 * @Description: 利用反射编写泛型数组
 * 1)首先获得a数组的类对象
 * 2)确认他是一个数组
 * 3)使用Class类(只能定义表示数组的类对象)getComponentType方法确定数组对应的类型
 * @Date: Create in 1:06 2019/7/30
 */
public class Code03 {

    public static void main(String[] args) {
        int[] a = {1,2,3};
        a = (int[]) goodCopy(a, 10);
        System.out.println(Arrays.toString(a));

        String[] b = {"Tom", "Jerry", "Tack"};
        b = (String[]) goodCopy(b, 10);
        System.out.println(Arrays.toString(b));

        System.out.println("The fallowing call will generate an exception.");
        b = (String[]) badCopy(b, 10);

    }

    // not useful
    private static Object badCopy(Object[] a, int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(a, 0, newArray, 0, Math.min(a.length, newLength));
        return newArray;
    }

    private static Object goodCopy(Object a, int newLength) {
        Class cls = a.getClass();
        if (!cls.isArray()) {
            return null;
        }
        //定数组对应的类型
        Class componentType = cls.getComponentType();
        int length = Array.getLength(a);
        Object newArray = Array.newInstance(componentType, newLength);
        System.arraycopy(a, 0, newArray, 0, Math.min(length, newLength));
        return newArray;
    }


}
