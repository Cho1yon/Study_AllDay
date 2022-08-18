package oneWeek.FIRST.数组;
import java.util.*;
public class ArrayCase01 {

    public static void main(String[] args) {
       // double Socre[] = new double[5];第一种动态分配方式
        double Socre [];//申明数组
        Socre = new double[5];//给数组分配存储空间
        Scanner myScanner = new Scanner(System.in);
        for (int i = 0; i < Socre.length; i++) {
            System.out.println("s请输入第"+(i+1)+"个元素的值");
            Socre[i] = myScanner.nextDouble();
        }
        System.out.println("数组的具体值为一下：===========");
        for (int i = 0; i < Socre.length; i++) {
            System.out.println("第"+ (i+1) +"个元素的值=" + Socre[i]);
        }

    }
}
