package oneWeek.FIRST.算术运算;

/**
 * @author choiyon
 * 三目运算
 */
public class TernaryOperatorDetail {
    //编写一个main方法
    public static void main(String[] args) {
//表达式 1 和表达式 2 要为可以赋给接收变量的类型
//(或可以自动转换/或者强制转换)
    int a =3;
    int b =8;
    int c = a > b ? (int)1.1 : (int) 3.4;
    double d = a > b ? a : b + 3;//可以的，满足 int -> double


    }
}

class TernaryOperatorExercise{
    //实现三个数的最大值,编写一个main方法
    public static void main(String[] args) {

//实习三个数据的最大值
        int a = 100;
        int b = 20;
        int c = 234;
/*
* 思路
*. 先得到 n1 和 n2 中最大数 , 保存到 max1
*. 然后再 求出 max1 和 n3 中的最大数，保存到 max2
* */
        int max1 = a > b ? a : b;
        int max2 = max1 > c ? max1 : c;
        System.out.println("max:"+max2);
    }
}
