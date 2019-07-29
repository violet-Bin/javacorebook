package reflect;

import chapter3.param.Employee;

import java.lang.reflect.Field;

/**
 * @Author: jiangjiabin
 * @Description: 设置访问权限
 * @Date: Create in 23:37 2019/7/29
 */
public class Code02 {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Employee Jerry = new Employee("Jerry", 99);
        Class cls = Jerry.getClass();
        //设置单个字段
//        Field f = cls.getDeclaredField("name");
//        f.setAccessible(true);
//        System.out.println(f);
//        Object obj = f.get(Jerry);
//        System.out.println(obj);

        //设置多个字段
        Field[] fields = cls.getDeclaredFields();
        Field.setAccessible(fields, true);
        for (Field ff : fields) {
            System.out.println(ff);
            Object o = ff.get(Jerry);
            System.out.println(o);
        }
    }
}
