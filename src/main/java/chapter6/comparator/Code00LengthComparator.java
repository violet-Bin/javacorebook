package chapter6.comparator;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author: jiangjiabin
 * @Description: Comparator
 * @Date: Create in 22:09 2019/7/30
 */
public class Code00LengthComparator {

    public static void main(String[] args) {
        String[] friends = {"Peter", "Pual", "Mary", "Jerry", "Tom"};
        Arrays.sort(friends, Comparator.comparingInt(String::length));
        for (String s : friends) {
            System.out.println(s);
        }
    }

}
