package oneWeek.FIRST.算术运算;

/**
 * @author： choiyon
 * Date：2022/7/27 22:45
 * 演示关系运算符的使用
 */
public class RelationalOperator {

    public static void main(String[] args) {

        //提示:  开发中，不可以使用  a, b
        int a = 9;
        int b = 8;
        System.out.println(a > b);
        //T
        System.out.println(a >= b);
        //T
        System.out.println(a <= b);
        //F
        System.out.println(a < b);
        //F
        System.out.println(a == b);
        //F
        System.out.println(a != b);
        //T
        boolean flag = a > b;
        //T
        System.out.println("flag=" + flag);
    }
}
