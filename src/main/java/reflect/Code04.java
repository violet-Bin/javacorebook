package reflect;

import chapter3.param.Employee;

import java.lang.reflect.Method;

/**
 * @Author: jiangjiabin
 * @Description: 调用任意方法
 * @Date: Create in 1:26 2019/7/30
 */
public class Code04 {

    public static void main(String[] args) throws Exception {
        Method square = Code04.class.getMethod("square", double.class);
        Method sqrt = Code04.class.getMethod("sqrt", double.class);

        printTable(1, 10, 10, square);
        printTable(1, 10, 10, sqrt);

        Employee Jerry = new Employee("Jerry", 99);
        Method getName = Jerry.getClass().getMethod("getName");
        String obj = (String) getName.invoke(Jerry);
        System.out.println(obj);

        //注意如果有方法重载，确保准确的找到需要的方法
        Method getName1 = Employee.class.getDeclaredMethod("getName");
        Method setName = Employee.class.getDeclaredMethod("setName", String.class);
        Method raiseSalary = Employee.class.getDeclaredMethod("raiseSalary", int.class);
        Method getSalary = Employee.class.getDeclaredMethod("getSalary");
        raiseSalary.setAccessible(true);
        String name = (String) getName1.invoke(Jerry);
        System.out.println(name);
        setName.invoke(Jerry, "Tom");
        String name1 = (String) getName1.invoke(Jerry);
        System.out.println(name1);
        raiseSalary.invoke(Jerry, 100);
        Object salary = getSalary.invoke(Jerry);
        System.out.println(salary);
    }

    public static double square(double x) {
        return x * x;
    }

    public static double sqrt(double x) {
        return Math.sqrt(x);
    }

    private static void printTable(double from, double to, int n, Method f) {
        System.out.println(f);
        double dx = (to - from) / (n - 1);

        for (double x = from; x <= to; x += dx) {
            try {
                double y = (Double) f.invoke(null, x);
                System.out.printf("%10.4f | %10.4f%n", x ,y);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
