package oneWeek.FIRST.数据类型转换;

/**
 * @author： choiyon
 * Date：2022/7/27 22:11
 */
public class AutoCovert {
    public static void main(String[] args) {
        //演示自动转换
        int num = 'a';
        //ok char -> int
        double d1 = 80;
        //ok int -> double
        System.out.println(num);
        //97
        System.out.println(d1);
        //80.0
    }
}
