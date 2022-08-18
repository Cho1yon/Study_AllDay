package oneWeek.FIRST.程序控制结构;
import java.time.Month;
import java.time.MonthDay;
import java.util.*;
/**
 * @author： choiyon
 * Date：2022/7/28 13:22
 * 嵌套分支应用案例

 *         出票系统∶根据淡旺季的月份和年龄，打印票价【课后练习】
 *         4_10旺季：
 *         成人（18-60）60
 *         儿童（<18）∶半价
 *         老人（>60）1/3
 *         淡季
 *         成人40 其他20
 * 思路分析
 * * （1）淡旺季·if·else
 * * （2）在旺季中，可以使用多分支处理三种情况
 * * （3）在淡季情况，使用双分支处理即可
 * */

public class QianTtaoExercise {

    public static void main(String[] args) {

        int Fares = 60;

        Random random = new Random();

        int Month = random.nextInt(1,13);

        System.out.println("现在是"+Month+"月");

        System.out.println("请输入你的年龄");

        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();

        if ( Month <= 10 && Month >=4  ) {

            if (age >= 18 && age<60 ) {
                System.out.println("此时是旺季，成年票价是："+Fares);

            }if (age >= 60) {
                System.out.println("此时是旺季，老年人票价为："+Fares/3);
            }if (age < 18 ){
                System.out.println("此时是旺季，儿童票价为："+Fares/2);
            }
        } else if (age >= 18 && age < 60) {

            System.out.println("此时是淡季，成年人的票价是："+Fares/3*2);
        }else {
            System.out.println("此时是淡季，老人儿童的票价为："+Fares/3);
        }

    }
}
