package chapter3.param;

import org.omg.CORBA.DoubleHolder;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 21:01 2019/7/28
 */
public class ParamTest {

    public static void main(String[] args) {

        System.out.println("Testing tripleValue:");
        double percent = 10;
        System.out.println("Before: percent = " + percent);
        tripleValue(percent);
        System.out.println("After: percent = " + percent);

        //...


    }

    public static void tripleValue(double x) {
        x = 3 * x;
        System.out.println("End of method: x = " + x);
    }

    //DoubleHolder todo
//    public static void tripleValue(DoubleHolder x) {
//        x = x * 3;
//        System.out.println("End of method: x = " + x);
//    }


    public static void tripleValue(Employee x) {
        x.raiseSalary(200);
        System.out.println("End of method: x = " + x.getSalary());
    }

    public static void swap(Employee x, Employee y) {
        Employee temp = x;
        x = y;
        y = temp;
        System.out.println("End of method: x=" + x.getName());
        System.out.println("End of method: y=" + y.getName());
    }



}
