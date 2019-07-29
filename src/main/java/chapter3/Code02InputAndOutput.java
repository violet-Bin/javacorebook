package chapter3;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 19:25 2019/7/28
 */
public class Code02InputAndOutput {

    public static void main(String[] args) throws IOException {
//        Scanner scan = new Scanner(System.in);
//        String res = scan.nextLine();
//        System.out.println(res);

        double d = 333.3333333333333333;
        System.out.printf("%8.2f", d);
        System.out.println();
        System.out.printf("%.2f", d);
        System.out.println();
        System.out.printf("%tc", new Date());
        System.out.println();
        System.out.printf("%tr", new Date());

        System.out.println("----------");
        Scanner scan1 = new Scanner(Paths.get("test.txt"), "utf-8");
        System.out.println(scan1.nextLine());
        PrintWriter p = new PrintWriter("Myfile1.txt", "utf-8");
        p.write("Myfile");
        p.close();
        String dir = System.getProperty("user.dir");
        System.out.println(dir);

        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] a = Arrays.copyOfRange(arr, 2, 4);
        System.out.println(Arrays.toString(a));
    }

}
