package chapter6.interfacetest;

/**
 * @Author: jiangjiabin
 * @Description: 接口可加静态方法、默认方法
 * @Date: Create in 17:31 2019/7/30
 */
public interface Interface00 {

    static void add(int a, int b){

    }

    default void raise() {
        System.out.println(Interface00.class);
    }

    default void mul() {

    }

    default void reduce(int a, int b) {

    }

}
