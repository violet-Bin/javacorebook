package chapter3;

import java.util.Random;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 0:10 2019/7/29
 */
public class Code03 {

    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt(10));

        System.out.println((int) (Math.random() * 10));
    }

}
