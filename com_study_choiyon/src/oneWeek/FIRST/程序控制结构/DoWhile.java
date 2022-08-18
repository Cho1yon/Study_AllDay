package oneWeek.FIRST.程序控制结构;

/**
 * @author： choiyon
 * Date：2022/7/27 23:37
 */
public class DoWhile {

    public static void main(String[] args) {


        //输出10句 我想学习java
        int i = 1; //循环变量初始化
        do {
            //循环执行语句
            System.out.println("我想学习java" + i);
            //循环变量迭代
            i++;

        }while(i <= 10);

        System.out.println("退出 do..while 继续执行.." + i);//11
    }
}
