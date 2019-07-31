package chapter6.interfacetest;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 17:31 2019/7/30
 */
public interface Interface01 {

    static void add(int a, int b){

    }

    void mul();

    default void reduce(int a, int b) {

    }

}
