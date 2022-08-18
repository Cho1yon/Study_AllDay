package oneWeek.FIRST.程序控制结构;

/**
 * @author： choiyon
 * Date：2022/7/27 23:34
 */
public class While01 {

    //编写一个main方法
    public static void main(String[] args) {

        //输出10句 我想学习java

        int i = 1; //循环变量初始化
        while( i <= 10 ) {//循环条件
            System.out.println("我想学习java" + i);//执行语句
            i++;//循环变量迭代
        }

        System.out.println("退出while ，继续.." + i); // 11
    }
}
