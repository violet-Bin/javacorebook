package chapter6.interfacetest;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 17:31 2019/7/30
 */
public class Code00 extends Code00Super implements Interface00, Interface01 {

    public static void main(String[] args) {
        Code00 obj = new Code00();
        obj.reduce(1, 2);
        Interface00.add(1, 2);

        obj.mul();

        obj.raise();//Code00Super的方法，类优先
    }

    //不重写就会报错
    @Override
    public void mul() {
//        Interface00.super.mul();
        //or
        //...
    }

    //不重写就会报错
    @Override
    public void reduce(int a, int b) {
        Interface00.super.reduce(a, b);
    }
}
