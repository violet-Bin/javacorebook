package chapter6.comparator;

import java.util.Date;

/**
 * @Author: jiangjiabin
 * @Description: Clone
 * @Date: Create in 22:16 2019/7/30
 */
public class Code01Clone implements Cloneable {

    private String name;  //不可变
    private Date hireDay; //可变

    //实现深拷贝
    public Code01Clone clone() throws CloneNotSupportedException {
        //call Object.cloned()
        Code01Clone cloned = (Code01Clone) super.clone();

        //cloned mutable fields
        cloned.hireDay = (Date) hireDay.clone();

        return cloned;

    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Code01Clone origin = new Code01Clone();
        Code01Clone second = (Code01Clone) origin.clone(); //浅拷贝
    }

}

class People {

    public static void main(String[] args) throws CloneNotSupportedException {
        Code01Clone one = new Code01Clone();
        one.clone();
    }

}
