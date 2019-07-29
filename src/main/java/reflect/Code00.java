package reflect;

import chapter3.param.Employee;

import java.util.Random;

/**
 * @Author: jiangjiabin
 * @Description: 获得对象的类名 1 2 3
 * 创建一个类的实例 4 5
 * @Date: Create in 22:39 2019/7/29
 */
public class Code00 {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        //1
        Employee e = new Employee("Tom", 100);
        Class cls = e.getClass();
        System.out.println(cls);

        //2
        String className = "java.util.Random";
        Class cls2 = Class.forName(className);
        System.out.println(cls2);

        //3
        Class cls3 = Random.class;
        Class cls4 = int.class;
        Class cls5 = Double[].class;
        System.out.println(cls3 + "  " + cls4 + " " + cls5);

        //4
        Employee employee = e.getClass().newInstance();
        employee.getName();  //调用默认的构造器（无参），如果没有就会抛出异常：java.lang.InstantiationException

        //5 forName与newInstance配合使用，可以根据存储在字符串里的类名创建对象
        String r = "java.util.Random";
        Object o = Class.forName(r).newInstance();
    }

}
